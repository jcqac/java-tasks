
/**
 * Write a description of class Dissertation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dissertation extends Resource
{
    // instance variables - replace the example below with your own
    private String levelStudy;
    private String establishment;
    /**
     * Constructor for objects of class Dissertation
     */
    public Dissertation(String ti, String de, int yp, String ls, String est)
    {
        super("dissertation", ti, de, yp, ResourceState.CHECKEDIN);
        levelStudy = ls;
        establishment = est;
    }
    
    public String getLevel()
    {
        return levelStudy;
    }
    
    public void setLevel(String st)
    {
        levelStudy = st;
    }
    
    public String getEstablishment()
    {
        return establishment;
    }
    
    public void setEstablishement(String es)
    {
        establishment = es;
    }
    
    public String toString()
    {
        return super.toString() + 
        "\nLevel of Study :" + getLevel() +
        "\nEstablishment: " + getEstablishment();
    }
}
