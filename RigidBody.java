package agh.czyzowsk;

import java.util.Random;

/**
 * Created by Damian on 2017-03-16.
 */
public class RigidBody {

    private int iloscPunktow;
    private double[][] rozmieszczeniePkt;
    private double momentBryly;

    RigidBody(){

        Random rand = new Random();
        iloscPunktow = rand.nextInt(40) + 1;
        rozmieszczeniePkt= new double[iloscPunktow][4];

        for(int i = 0; i < iloscPunktow ; i++){

            for (int j = 0; j<=2; j++){

                rozmieszczeniePkt[i][j] = rand.nextDouble() + rand.nextInt(10) - 5;

            }
            rozmieszczeniePkt[i][3] = rand.nextDouble() + rand.nextInt(3);
        }
    }


    public double momentGlownyBryly(){

        for (int i = 0; i < iloscPunktow; i++)
            momentBryly = momentBryly + rozmieszczeniePkt[i][3]*(Math.pow(rozmieszczeniePkt[i][0], 2)+Math.pow
                    (rozmieszczeniePkt[i][1], 2) + Math.pow(rozmieszczeniePkt[i][2], 2));

        return momentBryly;
    }

    public void moment(){

        System.out.printf("Moment glowny: %.2f" , momentGlownyBryly());

    }
}
