package javaTutorial.methods;

public class javaMethods {

    // Methods(Functions) - blocks of code that only run when called. 
    static void myMethod(){
        System.out.println("Accessed method from javaMethods.java");
    }


    // Using parameters for methods the type must be defined before the paramater name. 
    static void myParamatizedMethod(String fName, int age){
        System.out.println("First Name: " + fName + "\nAge: " + age);
    }


    // Implementation for a Method.
    static void helperMethod(int age){
        if(age < 21) System.out.println("Not Allowed");
        else System.out.println("Entry Allowed");
    }

    // Returning a value other than void (which returns no value)
    static boolean ofAge(int age){
        if(age < 21) System.out.println("Not Allowed");
        return true;
    }


    // Method overloading, you can have methods with the same name, 
    // but you must have at least one different data type.
    static double plusMethod(double x, double y){ return x + y;}
    static int plusMethod(int a, int b){return a + b;}

    public static void main(String[] args){
        // myMethod();
        // When calling a method with expected parameters the parameter type must match the method input. 
        // myParamatizedMethod("Cesar", 26);
        // Calling a helper function
        // helperMethod(20);
        if(ofAge(21)){
            System.out.println("Welcome Inside");
        }
    }
    
}
