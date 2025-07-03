
import java.util.Scanner;

public class esercizio2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in); 
        System.out.println("inserisci un numero: ");
        int num = scan.nextInt(); 
        int fat = 1;

        for(int i = num; i > 0; i--){
            fat = fat * i;
        }
        System.out.println(fat);
    }
}
