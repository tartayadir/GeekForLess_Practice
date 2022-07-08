package InheritTask;

import java.util.Random;

public class Cat extends Animal{

    public Cat(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    @Override
    public void move() {
        System.out.println("Cat is running.");
    }

    @Override
    public void say() {
        System.out.println("Myu! Myu!");
    }

    @Override
    public void swim() {
        System.out.println("Cat is swimming.");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                '}';
    }

    public static Cat createCat(){
        String name = new Random().ints(97, 123).
                limit(2).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).
                toString();
        int age = new Random().nextInt(101-1) + 1;

        return new Cat(name, age);
    }
}
