package agh.czyzowsk;

import java.util.Random;

/**
 * Created by Damian on 2017-03-16.
 */

public class MaterialPoint {

    private static double masa;

    private double momentBezwladnosci;
    private double przesunietyMoment;

    MaterialPoint(){

        Random rand = new Random();

        while (masa<0)
            masa = rand.nextInt(50) + 1;

    }

    MaterialPoint(double nowaMasa){

        masa = nowaMasa;

    }

    public double momentBezwladnosci(){

        momentBezwladnosci = 0;

        return momentBezwladnosci;
    }

    public double przesunietyMoment(double odleglosc){

        przesunietyMoment = momentBezwladnosci + (masa*odleglosc*odleglosc);

        return przesunietyMoment;
    }

    public void czymJestem(){

        System.out.println("Punkt Materialny. Mam mase: "
                + masa + ". Moj moment bezwladnosci to: " + momentBezwladnosci + ". Przesuniety moment bezwladnosci: "
                + przesunietyMoment);

    }

}
