package javaTutorial.fields;


public class javaMath {
    
    public static void main (String [] args){
        int x = 10;
        int y = 55;
        int z = -100;
        double decimalNumber = 3.5;

        System.out.println("(1) The .max(a,b) value of the two variables is: " + Math.max(x, y));

        System.out.println("(2) The .min(a,b) value of the two variables is: " + Math.min(x, y));
        
        System.out.println("(3) The .sqrt() method of the value X is: " + Math.sqrt(x));

        System.out.println("(4) The .abs() Absolute value of the variables is: " + Math.abs(z));

        System.out.println("(5) Raising the first parameter to the power of the second parameter: " 
        + Math.pow(x, decimalNumber));

        System.out.println("(6) The highest value of the two variables is: " + Math.max(x, y));


        //Round
        System.out.println("(7) Rounding the decimal using .round() to the nearest Integer: " + Math.round(decimalNumber));

        //Ceil
        System.out.println("(8) Rounding the decimal using .ceil() to the higher-end value: " + Math.ceil(decimalNumber));

        //Floor
        System.out.println("(9) Rounding the decimal using .floor() to the lower-end value.: " + Math.floor(decimalNumber));

        //Random
        System.out.println("(10) Getting a random double number using .random)() from 0 - 0.999999: " + Math.random());


    }
}
