
/**
 * Object user – to be called by class Game
 */
public class User
{
    private String name;
    private String type;
    private int age;
    private int height;

    public User(String theName, String theType, int theAge, int theHeight)
    {
        name = theName;
        type = theType;
        age = theAge;
        height = theHeight;
    }

    public void setName(String newName)
    {
        name = newName;
    }
    public String getName()
    {
        return name;
    }
    
    public void setType(String newType)
    {
        type = newType;
    }
    public String getType()
    {
        return type;
    }
    
    public void setAge(int newAge)
    {
        age = newAge;
    }
    public int getAge()
    {
        return age;
    }
    
    public void setHeight(int newHeight)
    {
        height = newHeight;
    }
    public int getHeight()
    {
        return height;
    }
    
    public void printUserInfo()
    {
        System.out.println("==== Game Character Info ====");
        System.out.println("Name: "+name);
        System.out.println("Class: "+type);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height +" cm");
        System.out.println("");
    }
}
