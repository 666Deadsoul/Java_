import java.util.HashSet;

//Performing intersection in Hashset
class Main {
    public static void main(String[] args) {

        HashSet<String> domesticAnimals = new HashSet<>();
        domesticAnimals.add("dog");
        domesticAnimals.add("elephant");
        domesticAnimals.add("goat");

        HashSet<String> wildAnimals = new HashSet<>();
        wildAnimals.add("lion");
        wildAnimals.add("tiger");
        wildAnimals.add("elephant");

        domesticAnimals.retainAll(wildAnimals);

        System.out.println(domesticAnimals);
    }
}