
/**
 * Write a description of class Journal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Journal extends Resource
{
    // instance variables - replace the example below with your own
    private String doi;
    private String contributors;

    /**
     * Constructor for objects of class Journal
     */
    public Journal(String ti, String de, int yp, String don, String con)
    {
        super("journal", ti, de, yp, ResourceState.CHECKEDIN);
        doi = don;
        contributors = con;
    }

    public String getDOI()
    {
        return doi;
    }
    
    public void setDOI(String don)
    {
        doi = don;
    }
    
    public String getContributors()
    {
        return contributors;
    }
    
    public void setContributors(String con)
    {
        contributors = con;
    }
    
    public String toString()
    {
        return super.toString() + 
        "\nDOI :" + getDOI() +
        "\nContributors: " + getContributors();
    }
}
