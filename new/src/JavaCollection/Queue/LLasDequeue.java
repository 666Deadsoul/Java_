import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(3);
        numbers.add(1);
        System.out.println("LinkedList: " + numbers);

        numbers.addFirst(6);
        System.out.println("After addFirst(6): " + numbers);

        numbers.addLast(8);
        System.out.println("After addLast(8): " + numbers);

        numbers.removeFirst();
        System.out.println("After removeFirst(): " + numbers);

        numbers.removeLast();
        System.out.println("After removeLast(): " + numbers);
    }
}