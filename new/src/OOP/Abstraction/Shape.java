package OOP.Abstraction;

abstract class Shape {
    abstract double getArea();
}

class Rectangle extends Shape {
    
    double length;
    double breadth;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double getArea() {
        double area = this.length * this.breadth;
        return area;
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 9.0);
        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}