package InheritTask;

import java.util.Random;

public class Duck extends Bird implements Flying {

    public Duck(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    @Override
    public void move() {
        System.out.println("Duck is running!");
    }

    @Override
    public void say() {
        System.out.println("Kry! Kry!");
    }

    @Override
    public void makeNest() {
        System.out.println("Duck is making nest.");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                '}';
    }

    public static Duck createDuck(){
        String name = new Random().ints(97, 123).
                limit(2).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).
                toString();
        int age = new Random().nextInt(101-1) + 1;
        return new Duck(name, age);
    }
}
