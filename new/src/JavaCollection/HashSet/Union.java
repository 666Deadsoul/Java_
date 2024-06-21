import java.util.HashSet;

//Performing union operation in hashset
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

        domesticAnimals.addAll(wildAnimals);

        System.out.println(domesticAnimals);
    }
}