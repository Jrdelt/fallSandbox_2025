package ObjectOrientedProgramming;

public class Second {

    // This is an Attribute / Field of the class.
    // Use final if you don't want the variable value to ever change
    private int x = 10;
    

    public Second(int x){
        // Dot notation, how to access a 
        this.x = x;
    }

    public int getInt(){
        return x;
    }


}
