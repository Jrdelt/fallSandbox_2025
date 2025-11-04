package javaTutorial.methods;

public class javaRecursion {
    // A function calling itself.
    public static int sum(int l){
        // the sum(l - 1);
        // passing in the value 4 we will start at 
        // 4 + The value (sum(l -1) := 3)
        // 3 + The value (sum(l -1) := 2)
        // 2 + The value (sum(l -1) := 1)
        // 1 + The value (sum(l -1) := 0)
        if(l > 0){return l + sum(l - 1);}
        // The else statement essentially adds the value of 0 to the output
        // of the recursion above. Stopping the loop from an infinite sequence.
        else{return 0;}
    }

    public static void main(String[] args){
        int result = sum(4);
        System.out.println(result);
    }
}
