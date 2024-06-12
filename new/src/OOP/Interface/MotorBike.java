package OOP.Interface;

interface MotorBike {
    abstract void brake(String Vname);
}
class SportsBike implements MotorBike {
    public void brake(String Vname) {
        System.out.println("Brake Applied on: " + Vname);
        System.out.println("Stopped!");
    }
}

class MountainBike implements MotorBike {
    public void brake(String Vname) {
        System.out.println("Brake Applied on: " + Vname);
        System.out.println("Stopped!");
    }
}

class Main {
    public static void main(String[] args) {
        SportsBike s1 = new SportsBike();
        s1.brake("R15");
    }
}