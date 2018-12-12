package java_zadania_level1.Zadanie5;

import java.util.Random;

public class Car {

    private float tankSize = 100f;
    private float fuelInTank;
    static final float MIN_PETROL_AMOUNT = 1;

    public Car(){   //situation when you dont know how much petrol u got in car tank
        Random petrolAomunt = new Random();
        this.fuelInTank = MIN_PETROL_AMOUNT + petrolAomunt.nextFloat() * (tankSize - MIN_PETROL_AMOUNT);
    }

    public Car(float fuelInTank) {  //situation when you know how much petrol u got in car tank
        this.fuelInTank = fuelInTank;
    }

    public void checkPetrolAmount() {
        System.out.println("W baku jest " + this.fuelInTank + " litrów paliwa.");
    }

    public float getFuelInTankAmount() {    //fuel in tank is private
        return fuelInTank;
    }

    public float getMaxFuelAmount() {
        return tankSize;
    }

    public void updateFuelAmount(float addedFuel) {
        this.fuelInTank += addedFuel;
    }


}
