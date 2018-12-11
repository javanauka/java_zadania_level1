package java_zadania_level1.Zadanie2;

public class App {
    public static void main(String[] args) {
        System.out.println("program testujący klasę punkt");

        Point point1 = new Point();
        Point point2 = new Point(1,1);

        System.out.print("dla punktu point1 ");
        point1.showCoordiates();
        System.out.print("dla punktu point2 ");
        point2.showCoordiates();

        point1.incraseXByOne();
        point2.incraseXByOne();

        System.out.print("dla punktu point1 ");
        point1.showCoordiates();
        System.out.print("dla punktu point2 ");
        point2.showCoordiates();

        point1.increseByGivenXY(5,10);
        point2.increseByGivenXY(-5,-10);

        System.out.print("dla punktu point1 ");
        point1.showCoordiates();
        System.out.print("dla punktu point2 ");
        point2.showCoordiates();

    }
}
