package Task2.translations;

import Task2.translationParts.Advertising;
import Task2.translationParts.Interview;
import Task2.translationParts.Song;
import Task2.translationParts.TranslationPart;
import java.util.List;
import java.util.Queue;

public interface Translation {

    boolean addSong(Song song);

    int getIncome();

    boolean addInterview(Interview interview);

    boolean addAdvertising(Advertising advertising);

    Queue<TranslationPart> getTranslationParts();

    List<Song> getSongs();

    List<Advertising> getAdvertising();

    List<Interview> getInterviews();
    double getTranslationDuration();

    double getPaidContentDuration();
}
