import java.util.*;
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private static int mid = 0;
    private int membershipID;
    private String name;
    private HashMap<Integer, Resource> borrowed = new HashMap<Integer, Resource>();
    
    /**
     * Constructor for objects of class Person
     */
    public Person(String nm)
    {
        mid++;
        membershipID = mid;
        name = nm;
    }

    public int getID()
    {
        return membershipID;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String nm)
    {
        name = nm;
    }
    
    public void borrowResource(Resource re)
    {
        borrowed.put(re.getAssetID(), re);
    }
    
    public void returnResource(int id)
    {
        borrowed.remove(id);
    }
    
    public String toString()
    {
        return "Membership ID: " + getID() +
        "\n Name: " + getName();
    }
    
}
