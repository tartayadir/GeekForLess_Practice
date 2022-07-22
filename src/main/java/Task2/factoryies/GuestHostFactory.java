package Task2.factoryies;

import Task2.anchors.GuestHost;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GuestHostFactory implements Factory<GuestHost>{

    @Override
    public GuestHost createRandomObject() {

        String name = generateRandomString(7);

        return new GuestHost(name, new File(name + "CV"));
    }

    @Override
    public List<GuestHost> createListRandomObject(int listSize) {

        List<GuestHost> list = new ArrayList<>();
        for (int i = 0; i < listSize; i++){
            list.add(createRandomObject());
        }

        return list;
    }
}
