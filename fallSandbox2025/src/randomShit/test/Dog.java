package randomShit.test;

public class Dog {
    private String name = "Justin";
    private int age = 100;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public void bark(){
        System.out.println("Woof! My name is " + name + " and I am " +  age +  " years old.");
    }
}
