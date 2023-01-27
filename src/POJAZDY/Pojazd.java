package POJAZDY;

public class Pojazd {


    double speed;
    double avarageOfFuel;
    double fuel;
    int wheel;
    double distance;
    public Pojazd(double speed, double avarageOfFuel,double fuel,int wheel){
        this.speed=speed;
        this.avarageOfFuel=avarageOfFuel;
        this.fuel=fuel;
        this.wheel=wheel;
    }

    public double mileAge(double avarageOfFuel, double distance){
        this.avarageOfFuel=avarageOfFuel;
        this.distance=distance;

        return (avarageOfFuel/distance)*100;

    }
}
