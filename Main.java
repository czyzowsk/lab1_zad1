package agh.czyzowsk;

public class Main {

    public static void main(String[] args) {

        double odleglosc = 10.315;

        MaterialPoint punktMaterialny = new MaterialPoint();
        MaterialPoint nowyPunktMaterialny = new MaterialPoint(10);

        punktMaterialny.przesunietyMoment(odleglosc);
        punktMaterialny.czymJestem();

        nowyPunktMaterialny.przesunietyMoment(odleglosc);
        nowyPunktMaterialny.czymJestem();


        for(int i = 10; i>0; i--){
            punktMaterialny = new MaterialPoint(i);

            punktMaterialny.przesunietyMoment(odleglosc);
            punktMaterialny.czymJestem();

        }

        RigidBody nowaBryla = new RigidBody();
        nowaBryla.moment();

    }
}
