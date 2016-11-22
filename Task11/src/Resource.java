
/**
 * This is an abstract class for library resources which could be
 * books, magazines, maps .etc
 * 
 * @author Johnny Che 
 * @version (a version number or a date)
 */
public abstract class Resource
{
    // instance variables - replace the example below with your own
    private static int idCounter = 0;
    private int assetID;
    private String assetType;
    private String title;
    private String shortDescription;
    private int yearPublished;
    private ResourceState state;
    
    /**
     * Constructor for objects of class Resources
     */
    public Resource(String asType, String ti, String desc, int yPub, ResourceState st)
    {
        idCounter++;
        assetID = idCounter;
        assetType = asType;
        title = ti;
        shortDescription = desc;
        yearPublished = yPub;
        state = st;
    }
    
    public int getAssetID()
    {
        return assetID;
    }
    
    public String getType()
    {
        return assetType;
    }
    
    public void setType(String st)
    {
        assetType = st;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String ti)
    {
        title = ti;
    }
    
    public String getDescription()
    {
        return shortDescription;
    }
    
    public void setDescription(String desc)
    {
        shortDescription = desc;
    }
    
    public int getYearPublished()
    {
        return yearPublished;
    }
    
    public void setYearPublished(int yp)
    {
        yearPublished = yp;
    }
    
    public String getState()
    {
        String s = state.toString();
        return s.toUpperCase();
    }
    
     /**
     * Mutator to set the state of the Resource
     * @param st this is the state to be set (CHECKEDIN || CHECKEDOUT)
     **/ 
    public void setState(String st)
    {
        state = ResourceState.valueOf(st.toUpperCase());
    }
    
    public String toString()
    {
        return "\nID: " + getAssetID() +
        "\nAsset Type: " + getType() +
        "\ntitle: " + getTitle() +
        "\nDescription: " + getDescription() +
        "\nYear Published: " + getYearPublished() + 
        "\nState: " + getState();
    }
    
}
