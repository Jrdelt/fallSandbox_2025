package javaTutorial.loops;

public class javaLoop {

    protected String testMe = "Test me String";
    protected String testMe2 = "TESTING TESTING";
    protected static String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};


    public static void main(String[] args) {
        // Nested for() LOOP, multiplication table.
        for (int i = 1; i <= 3; i++){ // Start here.
            // System.out.println("Hey ya");
            for (int j = 1; j <= 5; j++) { // Use thr value from i to iterate over every number in J.
                // System.out.println("Multiplication: "+ i * j);
            }
        }


        // forEach() loop, used exclusively to loop through anything that 
        // has an java.lang.Iterable interface.
        // Example: Arrays [], List <>, Map <>
        // for(Type <variableName> : Array to loop through)
        for(String car: cars){
            System.out.println(car);
        }


        // break; and continue;
        for(int i = 0; i <= 10; i ++){
            if(i == 5){
                System.out.println("Skipping the print of i: 5");
                continue;
            }
            if(i == 8){
                System.out.println("Broke on i = 8;");
                break;
            }
            System.out.println("i: " + i);
        }


    }

}
//When in a package what becomes accessible vs not being in a package
//, such as private or protected variables?


