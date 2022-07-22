package Task2.factoryies;

import Task2.translationParts.Advertising;
import Task2.translationParts.Song;

import java.util.ArrayList;
import java.util.List;

public class SongFactory implements Factory<Song> {

    @Override
    public Song createRandomObject() {
        return new Song(generateRandomString(10), generateRandomString(8),
                generateRandomInt(3, 10));
    }

    @Override
    public List<Song> createListRandomObject(int listSize) {

        List<Song> list = new ArrayList<>();
        for (int i = 0; i < listSize; i++){
            list.add(createRandomObject());
        }

        return list;
    }
}
