package Task2.views;

import Task2.anchors.Anchor;
import Task2.translationParts.TranslationPart;
import Task2.translations.Translation;

import java.util.List;

public class RadioStationView {

    public static void viewTranslationIncome(Translation translation, int id){

        System.out.println("Radio station " + id + " translation income : " + translation.getIncome() + "\n");
    }

    public static void viewAllTranslationPaths(List<TranslationPart> translationParts, int id){

        System.out.println("Radio station " + id + " consist of : ");
        translationParts.forEach(System.out::println);
        System.out.println();
    }

    public static void viewAllHosts(List<Anchor> anchors){

        System.out.println("Radio station hosts : ");
        anchors.forEach(System.out::println);
        System.out.println();
    }
}
