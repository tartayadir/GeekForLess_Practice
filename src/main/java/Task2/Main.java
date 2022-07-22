package Task2;

import Task2.controllers.RadioStations;

public class Main {

    public static void main(String[] args) {

        RadioStation radioStation = RadioStations.createRadioStation();
        new Main().viewRadioStationData(radioStation);
    }

    private void viewRadioStationData(RadioStation radioStation){

        RadioStations.viewToConsoleTranslationIncome(1, radioStation);
        RadioStations.viewToConsoleAllTranslationPaths(1, radioStation);
        RadioStations.viewToConsoleHosts(radioStation);
    }
}
