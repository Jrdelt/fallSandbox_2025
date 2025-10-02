package superclass;


public class createLabubu extends Labubu {



    /* CREATING A LABUBU USING EXTENDS W PARENT CLASS. */

    // Subclass constructor calls parent constructor
    public createLabubu(String name, String owner, int age, char check) {
        super(name, owner, age, check);  // super = parent constructor
    }
    public static void main(String[] args) {
        // Because createLabubu extends Labubu,
        createLabubu myLabubu = new createLabubu("Cher", "Jr", 4, 'F');
        
        // It inherits the method from Labubu
        myLabubu.labubuInformationOutput();
    }




    /* CREATING A LABUBU USING THE CLI */

    // import java.util.Scanner;
    // public static void main(String[] args) {
        // // Ask user for info
        // try (Scanner labubuScanner = new Scanner(System.in)) {
        //     // Ask user for info
        //     System.out.print("Enter Labubu name: ");
        //     String name = labubuScanner.nextLine();
            
        //     System.out.print("Enter owner name: ");
        //     String owner = labubuScanner.nextLine();
            
        //     System.out.print("Enter Labubu age: ");
        //     int age = labubuScanner.nextInt();
            
        //     System.out.print("Enter authenticity check (R/F): ");
        //     char check = labubuScanner.next().charAt(0);
            
        //     // Create new Labubu with given data
        //     Labubu newLabubu = new Labubu(name, owner, age, check);
            
        //     // Print its info
        //     newLabubu.labubuInformationOutput();
        // } catch (Exception e) {
        //     System.out.print(e);
        // }




}