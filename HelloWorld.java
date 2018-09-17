
/**
 * Write a description of class HelloWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HelloWorld
{
    public static void main(String[] args){
        
        //int x – "new" creates new instance of the class "Gundam"
        
        Gundam Z = new Gundam("Gundam Z", "red", 170);
        Gundam X = new Gundam("Gundam X", "white", 150);
        
        //now do something with the Objects
        System.out.println(Z.getName()); // get and print the value of name in the Z object
        System.out.println(Z.getColour());
        System.out.println(Z.getHeight());
        System.out.println("Change in name, colour and height:");
        Z.setName("Gundam Maverick");
        Z.setColour("black");
        Z.setHeight(190);
        System.out.println(Z.getName());
        System.out.println(Z.getColour());
        System.out.println(Z.getHeight());
    }
}
