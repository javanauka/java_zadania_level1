package java_zadania_level1.Zadanie4;

public class App {
    public static void main(String[] args){
        System.out.println("program sprawdza dzaiłanie metod z klasy Calculate");

        Calculate firstObj = new Calculate();

        firstObj.add(10.5f,10.5f);

        firstObj.add('a','b');

        Calculate.add(5,10);
    }
}
