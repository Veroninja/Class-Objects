
/**
 * Class Game – calls both object weapons and object user
 */
public class Game
{
    public static void main(String[] args)
    {
        User player1 = new User("Molly", "Mage", 74, 164);
        Weapon staff = new Weapon("Staff", "Ranged",160, 1);
        
        User player2 = new User("Ruenthal", "Soldier", 42, 183);
        Weapon sword = new Weapon ("Broadsword", "Close-combat", 194, 1);
        
        player1.printUserInfo();
        staff.printWeaponInfo();
        
        player2.printUserInfo();
        sword.printWeaponInfo();
    }
}
