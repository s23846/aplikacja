package POJAZDY;

import POJAZDY.Pojazd;

public class Moto extends Pojazd {

    int weightOfMoto;
    int energies;

    public Moto(double speed, double avarageOfFuel, double fuel,int wheel,int weightOfMoto, int energies) {
        super(speed, avarageOfFuel, fuel, wheel);
        this.weightOfMoto=weightOfMoto;
        this.energies=energies;
    }

    public int acceleration(int energies,int weightOfMoto){
     // przyspieszenie= f/m  f-wypadkowa sił działających na motor a m- masa motoru
        return energies/weightOfMoto;
    }






}
