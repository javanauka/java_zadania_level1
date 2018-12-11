package java_zadania_level1.Zadanie3;

public class Company {
    public static void main(String[] args) {
        System.out.println("program sprawdza klasę pracownik");

        Worker worker1 = new Worker();
        Worker worker2 = new Worker("Janusz");
        Worker worker3 = new Worker("Daniel","Kowalski");
        Worker worker4 = new Worker("Michał","Przykłądowy",20);

        System.out.println(worker1);
        System.out.println(worker2);
        System.out.println(worker3);
        System.out.println(worker4);

    }
}
