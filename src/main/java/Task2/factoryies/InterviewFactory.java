package Task2.factoryies;

import Task2.translationParts.Advertising;
import Task2.translationParts.Interview;

import java.util.ArrayList;
import java.util.List;

public class InterviewFactory implements Factory<Interview> {

    @Override
    public Interview createRandomObject() {

        return new Interview(generateRandomInt(60, 90), generateRandomString(10) );
    }

    @Override
    public List<Interview> createListRandomObject(int listSize) {

        List<Interview> list = new ArrayList<>();
        for (int i = 0; i < listSize; i++){
            list.add(createRandomObject());
        }

        return list;
    }
}
