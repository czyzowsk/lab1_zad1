package agh.czyzowsk;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        MaterialPoint defaultPoint = new MaterialPoint();
        MaterialPoint point = new MaterialPoint(20);

        int odleglosc = 10;

        System.out.printf("1. %s o masie %.2f\n",point.czymJestem(), defaultPoint.getMasa());
        System.out.printf("Moment bezwładności: %.2f\n", defaultPoint.momentBezwladnosci());
        System.out.printf("Moment przesunięty o %d wynosi: %.2f\n\n", odleglosc, defaultPoint.przesunietyMoment(odleglosc));

        System.out.printf("2. %s o masie %.2f\n",point.czymJestem(), point.getMasa());
        System.out.printf("Moment bezwładności: %.2f\n", point.momentBezwladnosci());
        System.out.printf("Moment przesunięty o %d wynosi: %.2f\n\n", odleglosc, point.przesunietyMoment(odleglosc));

        defaultPoint.setMasa(11.421);

        System.out.printf("1. %s o masie %.2f\n",point.czymJestem(), defaultPoint.getMasa());
        System.out.printf("Moment bezwładności: %.2f\n", defaultPoint.momentBezwladnosci());
        System.out.printf("Moment przesunięty o %d wynosi: %.2f\n\n", odleglosc,
                defaultPoint.przesunietyMoment(odleglosc));

        ArrayList<MaterialPoint> listOfMaterialPoints = new ArrayList<>();

        for(int iloscObiektow = 10; iloscObiektow>0; iloscObiektow--){
            MaterialPoint tempMaterial = new MaterialPoint();
            listOfMaterialPoints.add(tempMaterial);
        }
        for (MaterialPoint newMaterialPoint : listOfMaterialPoints){
            System.out.printf("%d. %s o masie %.2f\n",listOfMaterialPoints.indexOf(newMaterialPoint) + 3,
                    newMaterialPoint.czymJestem(), newMaterialPoint.getMasa());
            System.out.printf("Moment bezwładności: %.2f\n", newMaterialPoint.momentBezwladnosci());
            System.out.printf("Moment przesunięty o %d wynosi: %.2f\n\n", odleglosc,
                    newMaterialPoint.przesunietyMoment(odleglosc));
        }


    }
}
