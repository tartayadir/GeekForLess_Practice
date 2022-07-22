package Task2.factoryies;

import Task2.translationParts.Advertising;

import java.util.ArrayList;
import java.util.List;

public class AdvertisingFactory implements Factory<Advertising> {

    @Override
    public Advertising createRandomObject() {

        return new Advertising(generateRandomString(7), generateRandomInt(20));
    }

    @Override
    public List<Advertising> createListRandomObject(int listSize) {

        List<Advertising> list = new ArrayList<>();
        for (int i = 0; i < listSize; i++){
            list.add(createRandomObject());
        }

        return list;
    }
}
