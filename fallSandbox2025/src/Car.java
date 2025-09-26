
// Visibility (Public) - Every file can access this file.

public class Car {
    
    //Variable: states of a variable.
    private boolean working; //Accessible only by this class
    private boolean moving; //Accessible only by this class
    private boolean totalled; //Accessible only by this class
    private double speed; //Accessible only by this class
    private int numberWheels; //Accessible only by this class

    //Method: behavior of a class.
    public void move(double speed){
        if( working && !totalled){
            moving = true;
            this.speed = speed;
            System.err.println("The car is working and is not totalled.");
        }
    }
}
