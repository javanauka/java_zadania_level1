package java_zadania_level1.Zadanie5;

import java.util.Scanner;

public class GasStation {
    public static void main(String[] args){
        System.out.println("To jest stacja na której zatankujesz swoje auto");

        Car myCar = new Car();
        myCar.checkPetrolAmount();

        System.out.println("Czy chcesz rozpocząć tankowanie T/N");

        Scanner rd = new Scanner(System.in);
        String userChoice = rd.nextLine();

        while (userChoice.equals("t")) {

            System.out.println("Podaj ile chcesz dolać lub włącz automatyczne tankowanie wciskając A");
            Float pouredPetrol = rd.nextFloat();

            GasPump.pourPetrol(myCar,pouredPetrol);

            myCar.checkPetrolAmount();

            System.out.println("Czy chcesz kontynuować tankowanie T/N");
            String emptyLine = rd.nextLine(); //idk why after first input there is "" in rd.nextline
            userChoice = rd.nextLine();
        }

//        Scanner rd = new Scanner(System.in);
//        Float userChoice = rd.nextFloat();



        myCar.checkPetrolAmount();



    }
}
