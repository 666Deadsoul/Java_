// poll() - removes elements from the front
// offer() - adds elements from the back

//LinkedList as Queue
import java.util.LinkedList;
class Main {
    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Original LinkedList: " + fruits);
        fruits.poll();
        System.out.println("Queue after poll(): " + fruits);
        fruits.offer("Peach");
        System.out.println("Queue after offer(): " + fruits);
    }
}