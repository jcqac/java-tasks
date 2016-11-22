
/**
 * Write a description of class GovernmentDocuments here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GovernmentDocument extends Resource
{
    // instance variables - replace the example below with your own
    private int isbn;
    private String agency;
    private String contact;

    /**
     * Constructor for objects of class GovernmentDocuments
     */
    public GovernmentDocument(String ti, String de, int yp, int isb, String ag, String co)
    {
        // initialise instance variables
        super("government documents", ti, de, yp, ResourceState.CHECKEDIN);
        isbn = isb;
        agency = ag;
        contact = co;
    }
    
    public int getISBN()
    {
        return isbn;
    }
    
    public void setISBN(int in)
    {
        isbn = in;
    }
    
    public String getAgency()
    {
        return agency;
    }
    
    public void setAgency(String ag)
    {
        agency = ag;
    }
    
    public String getContact()
    {
        return contact;
    }
    
    public void setContact(String co)
    {
        contact = co;
    }
    
    public String toString()
    {
        return super.toString() + 
        "\nISBN :" + getISBN() +
        "\nAgency: " + getAgency() +
        "\nContact :" + getContact();
    }
    
    

}
