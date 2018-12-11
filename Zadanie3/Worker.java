package java_zadania_level1.Zadanie3;

public class Worker {

    private String name = "nie podanym";
    private String surname = "nie podanym";
    private int age = 0;

    public Worker(){

    }

    public Worker(String name) {
        this.name = name;
    }

    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Worker(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "Pracownik o imieniu " + name + " i nazwisku " + surname + " ma " + age + " lat";
    }
}
