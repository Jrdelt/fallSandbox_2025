package javaTutorial.loops;

public class whileJava {

    public static void main(String[] args) {

        int x = 100;
        int y = 50;

        // while() loop, simple
        while (y <= 99) {
            ++y;
            // System.out.println("Value of X: " + y);
        }

        // do while loop
        /**
         * The do while() loop will run at least once,
         * on the other hand the while loop will only run
         * if the condition is met.
         * This can help with starting a codeblock and catching any possible errors
         */
        do {
            // System.out.println("X is equal to: " + x);
            ++x;
        } while (x <= 200);

        int i = 120;
        int counter = 1;
        do {
            System.out.println("Counting successfully and ended on the counter: " + counter);
            ++counter;
            --i;
        } while (i > 100);
    }

}
