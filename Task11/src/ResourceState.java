
/**
 * Enumeration class resourceState - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum ResourceState
{
    CHECKEDIN("Checked In"), CHECKEDOUT("Checked Out");
    private String state;
    
    private ResourceState(String st)
    {
        state = st;
    }
    
    public String toString()
    {
        return state;
    }
}
