package OOP.Encapsulation;

class Rectangle {
    int length;
    int breadth;
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void calculateArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(12, 9);
        obj.calculateArea(); 
    }
}