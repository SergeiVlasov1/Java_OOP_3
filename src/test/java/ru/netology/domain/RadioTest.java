package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void getCurrentRadioStationLessLowLimitTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentRadioStationLowLimitTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentRadioStationUpperLimitTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentRadioStationMoreUpperLimitTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStationLowLimitPlusOne() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setPreviousCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setPreviousCurrentRadioStation();
        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setPreviousCurrentRadioStationLowerLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.setPreviousCurrentRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setNextCurrentRadioStation();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setNextRadioStationUpperLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.setNextCurrentRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int expected = 5;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeUpperLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeLowLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeDownLessLower() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setVolumeDown();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeDownLowLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.setVolumeDown();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.setVolumeUp();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeUpUpperLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.setVolumeUp();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeUpMoreLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setVolumeUp();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void getNumberRadioStation() {
        Radio radio = new Radio(10);
        int expected = 9;
        int actual = radio.getNumberRadioStation();
        assertEquals(expected, actual);
    }
}