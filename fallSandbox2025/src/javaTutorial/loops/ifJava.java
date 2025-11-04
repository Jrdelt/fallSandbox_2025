package javaTutorial.loops;

public class ifJava {

    public static void main(String[] args) {
        var x = 10;
        var y = 100;

        if (x > y) {
            System.out.println("X is Greater than y");
        } else if (x == y) {
            System.out.println("Values are equal to each other.!");
        } else {
            System.out.println("Y is Greater than X");
        }

        // Short-Hand if-else()
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        String result2 = (time < 12) ? "Good Morning" : // the : is a separator, of conditions.
                (time < 18) ? "Good Night" : "Good Evening";
        // the ? is the behavior after the condition, first block is the true value
        // second is false.
        System.out.println(result2);

        // NESTED if-loops
        if (x == 10) {
            if (y == 100) {
                System.out.println("Both statements were true");
            }
        }
        // Shorthand to combine conditions to one.
        if (x == 10 && y == 100) {
            System.out.println("Both conditions were met");
        }
    }
}
