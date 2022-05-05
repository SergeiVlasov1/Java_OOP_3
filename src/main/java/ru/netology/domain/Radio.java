package ru.netology.domain;

public class Radio {

    private int currentVolume;
    private int currentRadioStation;
    private int numberRadioStation = 10 - 1;

    public Radio(int numberRadioStation) {
        this.numberRadioStation = numberRadioStation - 1;
    }

    public Radio() {

    }

    public int getNumberRadioStation() {
        return this.numberRadioStation;
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            currentRadioStation = 9;
        }
        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setNextCurrentRadioStation() {
        setCurrentRadioStation(currentRadioStation = currentRadioStation + 1);
    }

    public void setPreviousCurrentRadioStation() {
        setCurrentRadioStation(currentRadioStation = currentRadioStation - 1);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public void setVolumeUp() {
        setCurrentVolume(currentVolume = currentVolume + 1);
    }

    public void setVolumeDown() {
        setCurrentVolume(currentVolume = currentVolume - 1);
    }

}
