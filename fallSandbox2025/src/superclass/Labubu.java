package superclass;
public class Labubu {
    private String labubuName;
    private String labubuOwner;
    private int labubuAge;
    private char authenticityCheck;

    // This is needed since the variable are private you need to set a CONSTRUCTOR for other classes to access.

    // Constructor
    public Labubu(String name, String owner, int age, char check) {
        this.labubuName = name;
        this.labubuOwner = owner;
        this.labubuAge = age;
        this.authenticityCheck = check;
    }

    public void labubuInformationOutput() {
        System.out.println("Name: " + labubuName 
            + " | Owned By: " + labubuOwner 
            + " | Labubu Age: " + labubuAge 
            + " | R/F: " + authenticityCheck);
    }
}
