
/**
 * Write a description of class Newspaper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Newspaper extends Resource
{
    // instance variables - replace the example below with your own
    private String publisher;
    private String cheifEditor;

    /**
     * Constructor for objects of class Newspaper
     */
    public Newspaper(String ti, String de, int yp, String pub, String cEd)
    {
        // initialise instance variables
        super("newspaper", ti, de, yp, ResourceState.CHECKEDIN);
        publisher = pub;
        cheifEditor = cEd;
    }
    
    public String getCheifEditor()
    {
        return cheifEditor;
    }
    
    public void setCheifEditor(String ce)
    {
        cheifEditor = ce;
    }
    
    public String getPublisher()
    {
        return publisher;
    }
    
    public void setPublisher(String pu)
    {
        publisher = pu;
    }
    
    public String toString()
    {
        return super.toString() + 
        "\nCheif Editor :" + getCheifEditor() +
        "\nPublisher: " + getPublisher();
    }

}
