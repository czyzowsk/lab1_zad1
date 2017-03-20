package agh.czyzowsk;

import java.util.Random;

import static java.lang.System.err;

/**
 * Created by Damian on 2017-03-16.
 */

public class MaterialPoint {

    Random rand = new Random();
    private double masa;
    private double momentBezwladnosci;
    private double przesunietyMoment;

    MaterialPoint(){
        masa = rand.nextInt(50) + rand.nextDouble();
    }

    MaterialPoint(double nowaMasa){
        masa = nowaMasa;
    }

    public double getMasa(){
        return masa;
    }

    public void setMasa(double nowaMasa){
        if (nowaMasa<0) {
            MyException exception = new MyException("Inpossible value of \"nowaMasa\"");
            exception.printStackTrace();
            System.exit(1);
        }
        else
            masa = nowaMasa;
    }

    public double momentBezwladnosci(){
        momentBezwladnosci = masa*0;
        return momentBezwladnosci;
    }

    public double przesunietyMoment(double odleglosc){
        przesunietyMoment = momentBezwladnosci + (masa*odleglosc*odleglosc);
        return przesunietyMoment;
    }

    public String czymJestem(){
        return "Punkt Materialny";
    }
}
