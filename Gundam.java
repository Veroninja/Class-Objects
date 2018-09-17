
/**
 * Write a description of class Gundam here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gundam
{
    // instance variables - fields describing this robot
    
    private int height;
    private String colour;
    private String name;

    /**
     * Constructor for objects of class Gundam
     */
    public Gundam(String theName, String theColour, int theHeight)
    {
        // initialise instance variables
        height = theHeight;
        colour = theColour;
        name = theName;
    }


    public String getName() //getter for the NAME field
    {
        return name;
    }
    public void setName(String newName) //setter for the NAME field
    {
        name = newName;
    }
    
    public String getColour() //getter for the COLOUR field
    {
        return colour;
    }
    public void setColour(String newColour) //setter for the COLOUR field
    {
        colour = newColour;
    }
    
    public int getHeight() //getter for the HEIGHT field
    {
        return height;
    }
    public void setHeight(int newHeight) //setter for the HEIGHT field
    {
        height = newHeight;
    }
}
