package Task2.controllers;

import Task2.RadioStation;
import Task2.anchors.Anchor;
import Task2.factoryies.Factory;
import Task2.factoryies.RadioStationFactory;
import Task2.translationParts.TranslationPart;
import Task2.translations.Translation;
import Task2.views.RadioStationView;

import java.util.List;

public class RadioStations {

    public static RadioStation createRadioStation(){

        Factory<RadioStation> radioStationFactory = new RadioStationFactory();
        return radioStationFactory.createRandomObject();
    }

    public static void viewToConsoleTranslationIncome(int translationIndex, RadioStation radioStation){

        Translation translation = radioStation.getTranslation(translationIndex);
        RadioStationView.viewTranslationIncome(translation, translationIndex);
    }

    public static void viewToConsoleAllTranslationPaths(int translationIndex, RadioStation radioStation){

        Translation translation = radioStation.getTranslation(translationIndex);
        List<TranslationPart> translationParts = translation.getTranslationParts().stream().toList();
        RadioStationView.viewAllTranslationPaths(translationParts, translationIndex);
    }

    public static void viewToConsoleHosts(RadioStation radioStation){

        List<Anchor> anchors = radioStation.getAnchors();
        RadioStationView.viewAllHosts(anchors);
    }


}
