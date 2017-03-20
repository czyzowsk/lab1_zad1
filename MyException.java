package agh.czyzowsk;

/**
 * Created by Damian on 2017-03-20.
 */
public class MyException extends Exception {
    //konstruktor klasy wyjatku. Potrzebuje go do informacji o nieprawidlowch wartosciach wejsciowych
    public MyException(String message) {
        super(message);
    }
}
