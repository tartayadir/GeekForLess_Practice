package Task2;

import Task2.anchors.Anchor;
import Task2.translationParts.TranslationPart;
import Task2.translations.Translation;

import java.util.List;

public class RadioStation {

    private List<Translation> translations;
    private List<Anchor> anchors;

    public RadioStation(List<Translation> translations, List<Anchor> anchors) {
        this.translations = translations;
        this.anchors = anchors;
    }

    public List<Translation> getTranslations() {
        return translations;
    }

    public void setTranslations(List<Translation> translations) {
        this.translations = translations;
    }

    public List<Anchor> getAnchors() {
        return anchors;
    }

    public void setAnchors(List<Anchor> anchors) {
        this.anchors = anchors;
    }

    public int getTranslationIncome(int translationID){
        return translations.get(translationID).getIncome();
    }

    public List<TranslationPart> getTranslationParts(int translationID){
        return translations.get(translationID).getTranslationParts().stream().toList();
    }

    public int getAnchorsNumber(){
        return anchors.size();
    }
    public int getTranslationsNumber(){
        return translations.size();
    }

    public Translation getTranslation(int translationIndex){

        if (translationIndex < translations.size()){
            return translations.get(translationIndex);
        }else {
            throw new IllegalArgumentException();
        }
    }

    public Anchor getAnchor(int anchorIndex) {

        if (anchorIndex < anchors.size()) {
            return anchors.get(anchorIndex);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
