
public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    // Overloading
    public Dog(int age) {
        super("Lucky", age);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " is barking at the nextdoor cat!");
    }

}
