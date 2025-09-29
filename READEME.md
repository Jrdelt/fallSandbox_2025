# 09/29/25 LECTURE

**- What does it take to run a java program?**
> You need a java file such as, App.java and once you run it in the using 'javac App.java' the compiler will output the byte code.

**- How do you compile and run java in the terminal?**
> javac -classpath bin demo1.App

**- What is src in a java folder path?**
> Usually contains your '.java' files, that results in the class being created in the bin folder.

**- What is bin in a java folder path?**
> This usually contains the output of the source code from the 'src' folder.

**- What is a subclass?**
<!-- > A class that is a child of a class. It inherits a class -->

- What is an access modifier?
> public = door wide open
> protected = open to family + neighbors (package + subclasses)
> default = open only to household (package)
> private = locked, only you have the key

**- What is a Primitive Data type?**
> character, byte, short range: (−32,768 to 32,767),integer, float, long, double, boolean. 

- for (int i = 0; i < 5; i++){
    if(i == 2){
        continue;
    }
    System.out.println("i = " + i);
}
> Output: i = 0, i = 1, i = 3, i = 4
> Two is skipped in the print because you reach the if(i ==2){continue}, this just goes back to the level above and continues the loop. 

**- How do you declare an array?**
> type [] <name>;
> 

**- What values are assigned to the arrays if they are defined with no values?**
> numbers: 0
> boolean: false
> string: null

