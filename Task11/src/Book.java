/**
 * Write a description of class Book here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Book extends Resource
{
    // instance variables - replace the example below with your own
    private int isbn;
    private String publisher;
    private int edition;
    private String author;
    private String genre;
    private boolean fiction = false;

    /**
     * Constructor for objects of class Book
     */
    public Book(String ti, String de, int yp, int isb, String pub, int ed, String au, String ge, boolean isF)
    {
        // initialise instance variables
        super("book", ti, de, yp, ResourceState.CHECKEDIN);
        isbn = isb;
        publisher = pub;
        edition = ed;
        author = au;
        genre = ge;
        fiction = isF;

    }
    
    public int getISBN()
    {
        return isbn;
    }
    
    public void setISBN(int in)
    {
        isbn = in;
    }
    
    public String getPublisher()
    {
        return publisher;
    }
    
    public void setPublisher(String pu)
    {
        publisher = pu;
    }
    
    public int getEdition()
    {
        return edition;
    }
    
    public void setEdition(int ed)
    {
        edition = ed;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public void setAuthor(String au)
    {
        author = au;
    }
    
    public String getGenre()
    {
        return genre;
    }
    
    public void setGenre(String ge)
    {
        genre = ge;
    }
    
    public boolean isFiction()
    {
        return fiction;
    }
    
    public void setFiction(boolean sf)
    {
        fiction = sf;
    }
    
    public String toString()
    {
        return super.toString() + 
        "\nISBN :" + getISBN() +
        "\nAuthor: " + getAuthor() +
        "\nPublisher :" + getPublisher() +
        "\nEdition: " + getEdition() +
        "\nGenre: " + getGenre() +
        "\nFiction: " + isFiction();
    }
    
}
