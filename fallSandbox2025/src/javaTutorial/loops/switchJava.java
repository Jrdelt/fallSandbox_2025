package javaTutorial.loops;

public class switchJava {

    public static void main(String[] args) {
        System.out.println("\n" + "\n<---- Skipped Nasty Command Line Path --->");
        int x = 70;
        int y = 70;

        // Switches
        /**
         * switch(), is calculated once
         * comparing each case to the switch(<value>)
         * once the condition is met for any specific case
         * the code runs that case
         */
        switch (x) {
            case 1:
                System.out.println("Today is Monday");
            case 2:
                System.out.println("Today is Tuesday");
            case 7:
                System.out.println("Today is Sunday");
                break;
            default: // Returns default value if no case is MET.
                System.out.println("Defaulting to default value, no matches were met.");
        }

        /**
         * Rule switch() using a String,
         * shorthand version of a switch.
         */
        String testMe = "This is testing";
        String testMe2 = "This is not Testing";
        boolean compareTestMe = testMe.equals(testMe2);
        switch (testMe2) {
            case "This is testing" -> System.out.println("Test case reaches. Strings Match.");
            case "This is not Testing" -> System.out.println("This is not testing reached.");
            default -> System.out.println("You have hit the default.");
        }
    }

}
