package JavaCollection.LinkedList;
import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        LinkedList<String> movies = new LinkedList<>();

        movies.add("Forrest Gump");
        movies.add("The Hangover");
        movies.add("Titanic");

        System.out.println("Original LinkedList: " + movies);

        movies.remove(1);
        System.out.println("Updated LinkedList: " + movies);
    }
}
