
/**
 * Object weapon – to be called by class game
 */
public class Weapon
{
    private String name;
    private String type;
    private int damage;
    private int level;

    public Weapon(String theName, String theType, int theDamage, int theLevel)
    {
       name = theName;
       type = theType;
       damage = theDamage;
       level = theLevel;
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
    
    public void setDamage(int newDamage)
    {
        damage = newDamage;
    }
    public int getDamage()
    {
        return damage;
    }
    
    public void setLevel(int newLevel)
    {
        level = newLevel;
    }
    public int getLevel()
    {
        return level;
    }
    
    public void printWeaponInfo()
    {
        System.out.println("==== Weapon Info ====");
        System.out.println("Name: "+name);
        System.out.println("Type: "+type);
        System.out.println("Damage: "+damage);
        System.out.println("Level: "+level);
        System.out.println("");
        System.out.println("");
    }
}
