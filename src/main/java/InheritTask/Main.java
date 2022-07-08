package InheritTask;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        startProgram();
    }

    private static void startProgram(){

        List<Animal> animals = Controller.createAnimalList(10);
        Controller.moveAnimals(animals);
        Controller.sayAnimals(animals);
        Controller.swimAnimals(animals);

        List<Bird> birds = Controller.createBirdList(10);
        Controller.makeBirdNests(birds);

        List<? extends Flying> list = Controller.createFlyingBirdList(10, Duck::createDuck);
        Controller.flyBirds(list);
    }
}
