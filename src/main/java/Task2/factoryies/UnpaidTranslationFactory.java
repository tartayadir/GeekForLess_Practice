package Task2.factoryies;

import Task2.translationParts.Advertising;
import Task2.translationParts.Interview;
import Task2.translationParts.Song;
import Task2.translations.Translation;
import Task2.translations.UnpaidTranslation;

import java.util.ArrayList;
import java.util.List;

public class UnpaidTranslationFactory implements Factory<UnpaidTranslation> {

    @Override
    public UnpaidTranslation createRandomObject() {

        UnpaidTranslation unpaidTranslation = new UnpaidTranslation(generateRandomInt(60,300));
        int listSize = generateRandomInt(2, 10);
        List<Song> songList = new SongFactory().createListRandomObject(listSize);
        List<Interview> interviewList = new InterviewFactory().createListRandomObject(listSize);
        List<Advertising> advertisingList = new AdvertisingFactory().createListRandomObject(listSize);

        while (!songList.isEmpty() && !interviewList.isEmpty() && !advertisingList.isEmpty()){
            int option = generateRandomInt(0, 1);

            switch (option){
                case 0 : {
                   unpaidTranslation.addSong(songList.remove(0));
                }
                case 1 : {
                    unpaidTranslation.addAdvertising(advertisingList.remove(0));
                }
                case 2 : {
                    unpaidTranslation.addInterview(interviewList.remove(0));
                }
            }
        }

        return unpaidTranslation;
    }

    @Override
    public List<UnpaidTranslation> createListRandomObject(int listSize) {

        List<UnpaidTranslation> list = new ArrayList<>();
        for (int i = 0; i < listSize; i++){
            list.add(createRandomObject());
        }

        return list;
    }
}
