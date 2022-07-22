package Task2.translations;

import Task2.translationParts.Advertising;
import Task2.translationParts.Interview;
import Task2.translationParts.Song;
import Task2.translationParts.TranslationPart;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class UnpaidTranslation implements Translation {

    private Queue<TranslationPart> translationParts;
    private List<Song> songs;
    private List<Advertising> advertising;
    private List<Interview> interviews;
    private double translationDuration;
    private double paidContentDuration;
    private int income;

    {
        this.advertising = new ArrayList<>();
        this.songs = new ArrayList<>();
        this.interviews = new ArrayList<>();
        this.translationParts = new LinkedList<>();

    }

    public UnpaidTranslation(double translationDuration) {
        this.translationDuration = translationDuration;
    }

    public UnpaidTranslation(){}

    public Queue<TranslationPart> getTranslationParts() {
        return new LinkedList<>(translationParts);
    }

    public List<Song> getSongs() {
        return new ArrayList<>(songs);
    }

    public List<Advertising> getAdvertising() {
        return new ArrayList<>(advertising);
    }

    public List<Interview> getInterviews() {
        return new ArrayList<>(interviews);
    }

    public double getTranslationDuration() {
        return translationDuration;
    }

    public double getPaidContentDuration() {
        return paidContentDuration;
    }

    public int getIncome() {
        return income;
    }

    public boolean addSong(Song song){
        if(song.getSongDuration()/(double)60 < translationDuration + song.getSongDuration()/(double)60){

            translationParts.add(song);
            songs.add(song);
            translationDuration+=song.getSongDuration()/(double)60;
            return true;

        }else{
            return false;
        }
    }

    public boolean addInterview(Interview interview){

        double interviewDuration = interview.getInterviewDuration()/(double)60;

        if(interviewDuration < translationDuration + interviewDuration &&
                interviewDuration + paidContentDuration < (translationDuration + interviewDuration)/2 ){

            translationParts.add(interview);
            interviews.add(interview);
            paidContentDuration+=interviewDuration;
            translationDuration+=interviewDuration;
            income += interview.getInterviewDuration() * Interview.secondPrice;
            return true;

        }else{
            return false;
        }
    }

    public boolean addAdvertising(Advertising advertising){

        double advertisingDuration = advertising.getAdvertisingDuration()/(double)60;

        if(advertisingDuration < translationDuration + advertisingDuration &&
                advertisingDuration + paidContentDuration < (translationDuration + advertisingDuration)/2 ){

            translationParts.add(advertising);
            this.advertising.add(advertising);
            paidContentDuration += advertisingDuration;
            translationDuration += advertisingDuration;
            income += advertising.getAdvertisingDuration() * Advertising.secondPrice;
            return true;

        }else{
            return false;
        }
    }
}
