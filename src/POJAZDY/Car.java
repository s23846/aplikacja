package POJAZDY;

import POJAZDY.Pojazd;

public class Car extends Pojazd {

    int boot;
    double distanceOfRace;
    double speedOfRace;

    public Car(double speed, double avarageOfFuel, double fuel, int wheel,int boot, double distanceOfRace, double speedOfRace) {
        super(speed, avarageOfFuel, fuel,wheel);
        this.boot=boot;
        this.distanceOfRace=distanceOfRace;
        this.speedOfRace=speedOfRace;
    }

    public double timeOfRace(double distanceOfRace,double speedOfRace){


        return distanceOfRace/speedOfRace;
    }

}
