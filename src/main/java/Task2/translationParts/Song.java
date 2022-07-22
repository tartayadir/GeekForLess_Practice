package Task2.translationParts;

import Task2.translationParts.TranslationPart;

public class Song implements TranslationPart {

    private String songName;
    private String authorName;
    private int songDuration;

    public Song(String songName, String authorName, int songDuration) {
        this.songName = songName;
        this.authorName = authorName;
        this.songDuration = songDuration;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getSongDuration() {
        return songDuration;
    }

    public void setSongDuration(int songDuration) {
        this.songDuration = songDuration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", songDuration=" + songDuration +
                '}';
    }
}
