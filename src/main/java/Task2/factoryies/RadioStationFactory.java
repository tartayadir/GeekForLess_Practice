package Task2.factoryies;

import Task2.RadioStation;
import Task2.anchors.Anchor;
import Task2.anchors.GuestHost;
import Task2.anchors.StaffHost;
import Task2.translations.Translation;
import Task2.translations.UnpaidTranslation;

import java.util.ArrayList;
import java.util.List;

public class RadioStationFactory implements Factory<RadioStation> {

    private final Factory<GuestHost> guestHostFactory = new GuestHostFactory();
    private final Factory<StaffHost> staffHostFactory = new StaffHostFactory();

    private final Factory<UnpaidTranslation> unpaidTranslationFactory = new UnpaidTranslationFactory();

    @Override
    public RadioStation createRandomObject() {

        List<Anchor> anchors = new ArrayList<>();
        int option;

        for (int i = 0; i < generateRandomInt(1, 4); i++){
            option = generateRandomInt(10);
            if (option % 2 ==0){
                anchors.add(staffHostFactory.createRandomObject());
            }else {
                anchors.add(guestHostFactory.createRandomObject());
            }
        }

        List<Translation> translations = new ArrayList<>(
                unpaidTranslationFactory.createListRandomObject(generateRandomInt(1,15)));

        return new RadioStation(translations, anchors);
    }

    @Override
    public List<RadioStation> createListRandomObject(int listSize) {

        List<RadioStation> list = new ArrayList<>();
        for (int i = 0; i < listSize; i++){
            list.add(createRandomObject());
        }

        return list;
    }
}
