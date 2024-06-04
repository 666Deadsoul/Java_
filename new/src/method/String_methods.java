package method;

public class String_methods {
    public static void main(String[] args) {
        String Word = "Sarina Maharjan ";
        String Word2= "Hellooo";
        System.out.println("Length: "+ Word.length());
        System.out.println("Concatination "+ Word.concat(Word2));
        System.out.println("Is it equal: "+ Word.equals(Word2));
        System.out.println(Word.charAt(1));
        System.out.println(Word.replace(Word, Word2));
    }
}
