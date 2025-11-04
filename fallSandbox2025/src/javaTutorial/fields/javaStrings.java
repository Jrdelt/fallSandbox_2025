package javaTutorial.fields;

import javaTutorial.App;

public class javaStrings extends App {

    protected static String testMe = "Test this to Locate me In the Books";
    protected static String testMe2 = "Testing this to Locate me In the Books ";
    protected static String trimMe = " This is a test to use .trim() ";

    public static void main(String [] args){
        System.out.println(testMe.indexOf("Locate")); //Locates the start of the regex/word provided.
        System.out.println(testMe.equals(testMe2)); //Compares the character within the string T/F.
        System.out.println("(1) String casted to UPPERCASE: " + testMe.toUpperCase()); // Makes each character in string UPPERCASE
        System.out.println("(2) String casted to lowercase: " + testMe.toLowerCase()); // Makes each character in string lowercase.
        System.out.println("(3) Character in the String at index 0: " + testMe.charAt(0));  // Returns the character at the index passed into .charAt().
        System.out.println("(4) New trimmed String: " + trimMe.trim()); // Trimming the end and start of string removing empty spaces.
        System.out.println("(5) This is the length of the String: " + testMe.length()); //Prints the length of thr String

        // .concat()
        String combineStrings = testMe.concat(testMe2).concat(trimMe);
        System.out.println("(6) Using concat to combine all strings: \n" + combineStrings);

        // Adding a <'> or <"> within a String or print etc... Simply use \ before character.
        System.out.println("(7) Luckily i\'m learning Java");
        System.out.println("(8) Luckily i\"m learning Java");
        System.out.println("(9) Luckily i\\m learning Java"); 
        System.out.println("(10) Luckily i\bm learning Java"); // \b removes one Character.
        System.out.println("(10) Luckily\tim learning Java"); // \t Inserts a tab space value into string.

    }
    
}
