package OOP.Abstraction;

abstract class Polygon {

    abstract void getArea();
    
    public void printSides() {
        System.out.println("Print sides of Polygon.");
    }
}
class Rectangle extends Polygon {
    void getArea() {
        System.out.println("Print the area of Rectangle.");
    }
}
class Main {
    public static void main(String[] args) {
        
        Rectangle rectangle1 = new Rectangle();
        rectangle1.printSides();
        rectangle1.getArea();
    }
}