package java_zadania_level1.Zadanie1;

public class Firm {
    public static void main(String args[]) {
        System.out.println("tworzymy klasę firma wykorzyszującą klasę pracownik");

        Worker worker1 = new Worker("Janusz","1001","male",20);
        Worker worker2 = new Worker("Seba","1002","male",21);
        Worker worker3 = new Worker("Karyna","1003","female",22);
        Worker worker4 = new Worker("Grazyna","1004","female",24);

        worker1.ShowWorker();
        worker2.ShowWorker();
        worker3.ShowWorker();
        worker4.ShowWorker();
    }
}
