package agh.czyzowsk;

import java.util.Random;

import static java.lang.System.err;

/**
 * Created by Damian on 2017-03-16.
 */

public class MaterialPoint {

    private Random rand = new Random(); //obiekt klasy random do losowania pseudolosowych liczb
    //prywatne zmienne dostepne tylko z tej klasy
    private double masa;
    private double momentBezwladnosci;
    private double przesunietyMoment;
    private double promienBezwladnosci = 0;

    //konstruktor domyslny bez parametrow wejsciowych. losuje pseudolosowe wartosci wieksze od 0
    MaterialPoint(){
        masa = rand.nextInt(50) + rand.nextDouble();
    }

    // konstruktor z parametrami wejsciowymi
    MaterialPoint(double nowaMasa){
        masa = (nowaMasa>0) ? nowaMasa : 0;//jesli parametr wejsciowy jest mniejszy od 0 obiekt ten bedzie mial mase 0
    }

    //dostep do wartosci masy z poziomu akcessora
    public double getMasa(){
        return masa;
    }

    //ustawianie masy obiektu za pomoca akcessora z kontrolą zawartosci
    public void setMasa(double nowaMasa){
        if (nowaMasa<0) {
            MyException exception = new MyException("Inpossible value of \"nowaMasa\"");
            exception.printStackTrace(); //wyjatek ze wzgledu na zla zadana wartosc
            masa = 0;
        }
        else
            masa = nowaMasa;
    }

    public void setPromienBezwladnosci(double nowyPromienBezwladnosci){
        promienBezwladnosci = nowyPromienBezwladnosci;
    }

    public double momentBezwladnosci(){
        momentBezwladnosci = masa*promienBezwladnosci;
        return momentBezwladnosci;
        }

    public double przesunietyMoment(double odleglosc){
        przesunietyMoment = momentBezwladnosci + (masa*odleglosc*odleglosc);
        return przesunietyMoment;
    }

    //opis punktu zwraca String czyli ciag znakow
    public String czymJestem(){
        return "Punkt Materialny";
    }
}
