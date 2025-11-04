

public class dayCare {
    public static void main(String[] args) {
        Animal a1 = new Cat("Cher", 10);  // polymorphism
        Animal a2 = new Dog("Avatar", 10);
        Animal a3 = new Cat("Cher", 10);

        a1.makeSound();
        a2.makeSound();

        a1.eat();
        a2.eat();


        System.out.println(a1.equals(a3));

    }
}
