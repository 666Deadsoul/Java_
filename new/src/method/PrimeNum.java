package method;

public class PrimeNum {

public static void main(String[] args) {
    for(int i=50;i<=100;i++){
        int count=0;
        for(int j=2;j<=i/2;j++){
            if(i%j==0){
                count++;
            }
        }
        if(count==0 && i!=1){
            System.out.print(i +" ");
        }
    }
} 
}

