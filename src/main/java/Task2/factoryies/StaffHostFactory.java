package Task2.factoryies;

import Task2.anchors.StaffHost;
import java.util.ArrayList;
import java.util.List;

public class StaffHostFactory implements Factory<StaffHost> {

    @Override
    public StaffHost createRandomObject() {

        return new StaffHost(generateRandomString(7),generateRandomInt(20));
    }

    @Override
    public List<StaffHost> createListRandomObject(int listSize) {

        List<StaffHost> list = new ArrayList<>();
        for (int i = 0; i < listSize; i++){
            list.add(createRandomObject());
        }

        return list;
    }
}
