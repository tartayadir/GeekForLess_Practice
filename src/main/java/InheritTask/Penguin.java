package InheritTask;

import java.util.Random;

public class Penguin extends Bird {

    public Penguin(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    @Override
    public void move() {
        System.out.println("Penguin is running.");
    }

    @Override
    public void say() {
        System.out.println("Pui! Pui!");
    }

    @Override
    public void makeNest() {
        System.out.println("Penguin is making nest.");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming.");
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                '}';
    }

    public static Penguin createPenguin(){

        String name = new Random().ints(97, 123).
                limit(2).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).
                toString();
        int age = new Random().nextInt(101-1) + 1;

        return new Penguin(name, age);
    }
}
