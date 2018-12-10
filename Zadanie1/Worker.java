package java_zadania_level1.Zadanie1;

//creating class worker with three fields
//todo
//use enum for sex, use builder scheme

public class Worker {

    private String name;
    private String idNumber;
    private String sex;
    private int age;

    public Worker(String name, String idNumber, String sex, int age) {
        this.name = name;
        this.idNumber = idNumber;
        this.sex = sex;
        this.age = age;
    }

    public void ShowWorker() {
//        System.out.printf("imię pracownika: %s\npesel pracownika: %d\npłeć pracownika: %s\nwiek pracownika: %d",this.name,this.idNumber,
//                this.sex, this.age);
        System.out.println("imie: " + this.name + " pesel: " + this.idNumber + " wiek: " + this.age + " płeć: " + this.sex);
    }
}
