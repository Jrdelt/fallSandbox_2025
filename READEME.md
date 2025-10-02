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


**- What values are assigned to the arrays if they are defined with no values?**
> numbers: 0
> boolean: false
> string: null


# 09/30/25 LECTURE

**-What is a Object Oriented Programming?**


# 10/01/25 LECTURE

**- What defines a superclass?**
> A superclass lets you manipulate different aspects of a instance, think of it like a blueprint.

```java
public class Vehicle {

  protected String brand = "Ford";        // Vehicle attribute

  public void honk() {                    // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}

public class Car extends Vehicle {
  private String modelName = "Mustang";    // Car attribute

  public static void main(String[] args) {

// Create a myCar object
// Class Type / Blueprint    <name>           creates new object in memory    Calling constructor
         Car                myFastCar     =                new                       Car();
    

    // Call the honk() method (from the Vehicle class) on the myCar object
    // This is only possible because we used ```**EXTENDS** Vehicle```.
    myCar.honk();


    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    System.out.ptintln(newCarBrand);
  }
}
```


# 10/02/25 LECTURE

**- What is a CONSTRUCTOR, provide an EXAMPLE?**
> Its job is to initialize the fields within the class


```java
// Default Value Constructor
public class <className> extends <SUPERCLASS>{
    private int years;
    public <className>(int <variableName>){
        this.years = years;
    }
}
```

**- What is a private variable, provide an EXAMPLE.**
> Private makes the variables only accessible in the local file, not even if they extend into subclass.
> You need to create a getter method to access the variable.
```java
public class superClass{
    private String name;

    //This is an example of a getter method you'd set in the superclass.
    public String getName() {   // getter
        return name;
    }
}

public class subClass extends superClass(){
    private String subName;

    public class subVariables(){
        this.subName = getName();
    }
}
```

**-What is a PROTECTED variable, provide an example.**
> Can be accessed within the same class, and same packages, 
> non sub-classes and not within same package cannot access.


**-What is @Override used for?**
> It changes the behavior of a method that is assigned in the parent class, redefining its behavior in the subclass.

```java
//PARENT CLASS - Given the method sayName(), we can manipulate its behavior in other classes with maintaining its 
//original behavior in the parent class.
class Labubu {
    protected String name = "Default Labubu";

    public void sayName() {
        System.out.println("My name is " + name);
    }
}

//SUBCLASS - The @Override will redefine the behavior of the method in this class only.
class CesarLabubu extends Labubu {
    @Override
    public void sayName() {
        System.out.println("Hola! Soy " + name);
    }
}
```

> Another example of targeting specific lines within the initial method you wish to change.
```java
class Labubu {
    public void info() {
        System.out.println("Name: Default Labubu");
        System.out.println("Owner: " + getOwner()); // 👈 delegated
        System.out.println("Age: timeless");
    }

    // "Hook" method
    protected String getOwner() {
        return "Unknown";
    }
}

class CesarLabubu extends Labubu {
    @Override
    protected String getOwner() {
        return "Cesar";   // 👈 only changed this piece
    }
}```


