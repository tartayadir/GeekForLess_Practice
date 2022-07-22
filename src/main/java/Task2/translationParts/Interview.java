package Task2.translationParts;

import Task2.translationParts.TranslationPart;

public class Interview implements TranslationPart {

    private int interviewDuration;
    public static final int secondPrice = 30;
    private String nameInterviewee;


    public Interview(int interviewDuration, String nameInterviewee) {
        this.interviewDuration = interviewDuration;
        this.nameInterviewee = nameInterviewee;
    }

    public int getInterviewDuration() {
        return interviewDuration;
    }

    public void setInterviewDuration(int interviewDuration) {
        this.interviewDuration = interviewDuration;
    }

    public String getNameInterviewee() {
        return nameInterviewee;
    }

    public void setNameInterviewee(String nameInterviewee) {
        this.nameInterviewee = nameInterviewee;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "interviewDuration=" + interviewDuration +
                ", nameInterviewee='" + nameInterviewee + '\'' +
                '}';
    }
}
