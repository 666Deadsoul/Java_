package OOP.Encapsulation;

//data hiding
class Shape {
    private int length;
    private int breadth;
    public void setLength(int length) {
        this.length = length;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void calculateArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

class Main {
    public static void main(String[] args) {
        Shape obj = new Shape();
        obj.setLength(32);
        obj.setBreadth(9);
        obj.calculateArea(); 
    }
}