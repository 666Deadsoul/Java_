package JavaCollection.ArrayList;
    import java.util.ArrayList;
    import java.util.Scanner;
    
  //to get element using index  
class Names {
        public static void main(String[] args) {
            ArrayList<String> names = new ArrayList<>();
            names.add("John");
            names.add("Harry");
            names.add("Niall");
    
            Scanner input = new Scanner(System.in);
            int index = input.nextInt();

            String ele = names.get(index);
            System.out.println(ele);
    
            input.close();
        }
    }

