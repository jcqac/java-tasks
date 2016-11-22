
/**
 * Write a description of class Magazine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Magazine extends Resource
{
    // instance variables - replace the example below with your own
    private String cheifEditor;
    private int issueNumber;
    private String genre;

    /**
     * Constructor for objects of class Magazine
     */
    public Magazine(String ti, String de, int yp,String ce, int isn, String pub, String ge)
    {
        // initialise instance variables
        super("magazine", ti, de, yp, ResourceState.CHECKEDIN);
        cheifEditor = ce;
        issueNumber = isn;
        genre = ge;
    }
    
    public String getCheifEditor()
    {
        return cheifEditor;
    }
    
    public void setCheifEditor(String ce)
    {
        cheifEditor = ce;
    }
    
    public int getIssue()
    {
        return issueNumber;
    }
    
    public void setIssue(int is)
    {
        issueNumber = is;
    }
    
    public String getGenre()
    {
        return genre;
    }
    
    public void setGenre(String ge)
    {
        genre = ge;
    }
    
    public String toString()
    {
        return super.toString() + 
        "\nCheif Editor :" + getCheifEditor() +
        "\nIssue Number: " + getIssue() +
        "\nGenre: " + getGenre();
    }
    

}
