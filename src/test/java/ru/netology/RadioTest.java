package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testSetTheRadioStationNumber.csv")
    public void testSetTheRadioStationNumber (int expected, int newStation) {
        Radio radio = new Radio();

        radio.setCurrentStation(newStation);

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testSetCurrentVolume.csv")
    public void testSetCurrentVolume (int expected, int newVolume) {
        Radio radio = new Radio();

        radio.setCurrentVolume(newVolume);

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }



    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testNextStation.csv")
    public void testNextStation (int expected, int station){
        Radio radio = new Radio();
        radio.setCurrentStation(station);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testPrevStation.csv")
    public void testPrevStation (int expected, int station){
        Radio radio = new Radio();
        radio.setCurrentStation(station);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testUpVolume.csv")
    public void testUpVolume(int expected, int volume){
        Radio radio = new Radio();
        radio.setCurrentVolume(volume);

        radio.upVolume();

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testDownVolume.csv")
    public void testDownVolume(int expected, int volume){
        Radio radio = new Radio();
        radio.setCurrentVolume(volume);

        radio.downVolume();

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
