package java_zadania_level1.Zadanie5;

public class GasPump {

    public static void pourPetrol(Car car, float knownPetrolPoured) {    //when you know how much petrol u want pour
        float actualFuelAmount = car.getFuelInTankAmount();
        float maxFuelAmount = car.getMaxFuelAmount();


        if (knownPetrolPoured > (maxFuelAmount - actualFuelAmount)){
            System.out.println("Zamówiona ilość paliwa nie zmieści się teraz w baku.");
        } else {
            car.updateFuelAmount(knownPetrolPoured);
        }
    }

}
