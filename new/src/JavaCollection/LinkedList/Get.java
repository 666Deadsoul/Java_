package JavaCollection.LinkedList;

import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(222);
        numbers.add(333);

        int element = numbers.get(0);
        System.out.print("Element at index 0: " + element);
    }
}