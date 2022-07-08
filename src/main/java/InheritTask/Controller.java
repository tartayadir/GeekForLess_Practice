package InheritTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Controller {

    public static void flyBirds(List<? extends Flying> list){
        list.forEach(Flying::fly);
        System.out.println();
    }

    public static void makeBirdNests(List<? extends Bird> list){
        list.forEach(Bird::makeNest);
        System.out.println();
    }

    public static void swimAnimals(List<? extends Animal> list){
        list.forEach(Animal::swim);
        System.out.println();
    }

    public static void sayAnimals(List<? extends Animal> list){
        list.forEach(Animal::say);
        System.out.println();
    }

    public static void moveAnimals(List<? extends Animal> list){
        list.forEach(Animal::move);
        System.out.println();
    }

    public static List<Animal> createAnimalList(int listSize){

        List<Animal> list = new ArrayList<>();
        Animal animal;

        for (int i = 0; i < listSize; i++){

            int option = new Random().nextInt(5-1) + 1;
            animal =  switch(option){
                case 1 -> Dog.createDog();
                case 2 -> Cat.createCat();
                case 3 -> Duck.createDuck();
                default -> Penguin.createPenguin();
            };

            list.add(animal);
        }

        return list;
    }

    public static List<Bird> createBirdList(int listSize){

        List<Bird> list = new ArrayList<>();
        Bird bird;

        for (int i = 0; i < listSize; i++){

            int option = new Random().nextInt(3-1) + 1;
            if (option == 1){
                bird = Duck.createDuck();
            }else {
                bird = Penguin.createPenguin();
            }
            list.add(bird);
        }

        return list;
    }

    public static List<? extends Flying> createFlyingBirdList(int listSize, Supplier<? extends Flying> supplier){

        Stream<? extends Flying> stream = Stream.generate(supplier);
        return stream.limit(listSize).collect(Collectors.toList());
    }


}
