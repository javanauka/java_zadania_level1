package java_zadania_level1.Zadanie4;

public class Calculate {

    public Calculate() {

    }

    public void add(float firstArgument, float secondArgument) {
        float sumOfArguments = firstArgument + secondArgument;
        System.out.printf("wprowadzono argunenty typu float %f i %f a ich suma wynosi %f\n",firstArgument, secondArgument, sumOfArguments);
    }

    public void add(char firstArgument, char secondArgument) {
        char sumOfArguments = (char) (firstArgument + secondArgument);
        System.out.printf("wprowadzono argunenty typu char %c i %c a ich suma wynosi %c\n",firstArgument, secondArgument, sumOfArguments);
    }

    public static void add(int firstArgument, int secondArgument) {
        int sumOfArguments = firstArgument + secondArgument;
        System.out.printf("wprowadzono argunenty %d i %d a ich suma wynosi %d",firstArgument, secondArgument, sumOfArguments);
    }
}
