
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("inserisci una parola");
        String name = scan.nextLine();

        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += name.charAt(i);
        }
        System.out.println(reverse);
    }
}
