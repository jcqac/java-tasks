import java.util.*;
/**
 * Write a description of class Library here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Library
{
    // instance variables - replace the example below with your own
    private String location;
    private HashMap<Integer, Resource> allResources = new HashMap<Integer, Resource>();
    private HashMap<Integer, Person> allPeople = new HashMap<Integer, Person>();
    private static Library uniqueInstance;

    /**
     * Constructor for objects of class Library
     */
    public Library(String loc)
    {
        location = loc;
    }
    
    public static Library getInstance(String loc)
    {
        if(uniqueInstance == null)
        {
            uniqueInstance = new Library(loc);
        }
        return uniqueInstance;
    }
    
    public String getLocation()
    {
        return location;
    }
    
    public void addResource(Resource re)
    {
        allResources.put(re.getAssetID(), re);
    }
    
    public void removeResource(int id)
    {
        allResources.remove(id);
    }
    
    public void addPerson(Person per)
    {
        allPeople.put(per.getID(), per);
    }
    
    public void removePerson(int id)
    {
        allPeople.remove(id);
    }
    
    public void borrowResource(int mid, int rid)
    {
        Person temp = allPeople.get(mid);
        Resource res = allResources.get(rid);
        
        res.setState("CHECKEDOUT");
        temp.borrowResource(res);
    }
    
    public void returnResource(int mid, int rid)
    {
        Person temp = allPeople.get(mid);
        Resource res = allResources.get(rid);
        
        res.setState("CHECKEDIN");
        temp.returnResource(rid);
    }
}
