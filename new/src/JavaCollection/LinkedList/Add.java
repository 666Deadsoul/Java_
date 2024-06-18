package JavaCollection.LinkedList;
import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        // create a LinkedList
        LinkedList<String> movies = new LinkedList<>();

        // add elements
        movies.add("Forest Gump");
        movies.add("The Hangover");
        movies.add("Titanic");

        System.out.println("LinkedList: " + movies);
    }
}
