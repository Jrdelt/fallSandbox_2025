import java.util.Objects;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();
    
    public void eat(){
        System.out.println(name + " is eating!");
    }

    @Override
    public boolean equals(Object check){
        Animal testAnimalCheck = (Animal) check;
        return age == testAnimalCheck.age && name.equals(testAnimalCheck.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, age);
    }

}
