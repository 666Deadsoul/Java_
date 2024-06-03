package methods;

public class Basicc {
    public String rev(String name){
        String rev_string="";
        for(int i=name.length()-1;i>=0;i--){
            rev_string+= name.charAt(i);
        }
        return rev_string;
    }
    public static void main(String[] args) {
        Basicc b = new Basicc();
        System.out.println(b.rev("Sarina"));
    }
}
