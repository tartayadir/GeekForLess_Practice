package Task2.factoryies;

import java.util.List;

public interface Factory<T> {

    T createRandomObject();

    List<T> createListRandomObject(int listSize);

    default String generateRandomString(int sizeInt){

        StringBuilder string = new StringBuilder("");

        string.append((char) generateRandomInt(65,91));
        for(int i = 0; i < sizeInt-1; i++){
            string.append((char)(generateRandomInt(97, 122)));
        }

        return string.toString();
    }

    default int generateRandomInt(int leftBound, int rightBound){

        return (int) (Math.random()*(rightBound+1-leftBound) + leftBound);
    }

    default int generateRandomInt(int rightBound){

        return (int) (Math.random()*rightBound);
    }
}
