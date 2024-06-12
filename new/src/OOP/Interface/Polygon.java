package OOP.Interface;
import java.util.Scanner;

interface Polygon {
    abstract public void getArea(int length, int breadth);
}

class Rectangle implements Polygon {
    public void getArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

class Main {
    public static void main(String[] args) {
        
        Rectangle rect1 = new Rectangle();
        System.out.println("Enter length and breadth:");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int breadth = input.nextInt();
        rect1.getArea(length, breadth);
        input.close();
    }
}