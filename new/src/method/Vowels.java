package method;

public class Vowels {
    public int Counter(String word){
        int vowel_count=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='a' || word.charAt(i)=='e' ||
            word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u'){
                vowel_count++;
            }
        }
        return vowel_count;
    }
    public static void main(String[] args) {
        String word = "Helo World";
        Vowels v = new Vowels();
        System.out.println("Total Vowels: "+ v.Counter(word));
    }
}
