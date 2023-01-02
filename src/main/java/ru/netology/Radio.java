package ru.netology;

public class Radio {
    private int firstStation = 0;
    private int lastStation = 9;
    private int currentStation = firstStation;
    private int firstVolume = 0;
    private int lastVolume = 100;
    private int currentVolume = firstVolume;

    public Radio(){

    }
    public Radio(int numberOfStations) {
        lastStation = firstStation + numberOfStations - 1;
    }


    public int getCurrentStation() {
        return currentStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation){
        if (newCurrentStation < firstStation){
            return;
        }
        if (newCurrentStation > lastStation){
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < firstVolume){
            return;
        }
        if (newCurrentVolume > lastVolume){
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextStation() {
        if (currentStation == lastStation){
            currentStation = firstStation;
            return;
        }
        currentStation = currentStation + 1;
    }

    public void prevStation() {
        if (currentStation == firstStation){
            currentStation = lastStation;
            return;
        }
        currentStation = currentStation - 1;
    }

    public void upVolume() {
        if (currentVolume < lastVolume){
            currentVolume = currentVolume + 1;
        }
    }

    public  void downVolume() {
        if (currentVolume > firstVolume){
            currentVolume = currentVolume - 1;
        }
    }


}