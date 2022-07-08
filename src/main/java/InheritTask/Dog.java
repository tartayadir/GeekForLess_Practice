package InheritTask;

import java.util.Random;

public class Dog extends Animal{

    public Dog(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    @Override
    public void move() {
        System.out.println("Dog is running.");
    }

    @Override
    public void say() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                '}';
    }

    public static Dog createDog(){
        String name = new Random().ints(97, 123).
                limit(2).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).
                toString();
        int age = new Random().nextInt(101-1) + 1;
        return new Dog(name, age);
    }
}
