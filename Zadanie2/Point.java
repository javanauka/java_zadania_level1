package java_zadania_level1.Zadanie2;

public class Point {

    private int xCoordinate;
    private int yCoordinate;

    public Point() {    //overriding constructor

    }

    public Point(int xCoordinate, int yCoordinate) {    //overriding constructor
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public void incraseXByOne() {
        this.xCoordinate++;
    }

    public void incraseYByOne() {
        this.yCoordinate++;
    }

    public void increseByGivenXY(int increaseX, int increaseY){
        this.xCoordinate += increaseX;
        this.yCoordinate += increaseY;
    }

    public int[] getXYCoordinates() {   //get both, X and Y at once
        int[] coordinates = {this.xCoordinate, this.yCoordinate};
        return coordinates;
    }

    public int getXCoordinate() {      //get X
        return this.xCoordinate;
    }

    public int getYCoordinate() {       //get Y
        return this.yCoordinate;
    }

    public void showCoordiates() {
        System.out.printf("współrzęda X punktu wynosi %d a współrzędna Y wynosi %d\n",this.xCoordinate,this.yCoordinate);
    }
}
