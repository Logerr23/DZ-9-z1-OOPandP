package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    public int getCurrentStation() {
        return currentStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation){
        if (newCurrentStation < 0){
            return;
        }
        if (newCurrentStation > 9){
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0){
            return;
        }
        if (newCurrentVolume > 10){
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextStation() {
        if (currentStation == 9){
            currentStation = 0;
            return;
        }
        currentStation = currentStation + 1;
    }

    public void prevStation() {
        if (currentStation == 0){
            currentStation = 9;
            return;
        }
        currentStation = currentStation - 1;
    }

    public void upVolume() {
        if (currentVolume < 10){
            currentVolume = currentVolume + 1;
        }
    }

    public  void downVolume() {
        if (currentVolume > 0){
            currentVolume = currentVolume - 1;
        }
    }


}