import java.util.Scanner;
public class Coracao {
    public static void main(String[] args) {
        
        System.out.println("Hello Word, eu te amo cara S2.");
        System.out.println("Essa foi fácil");
        System.out.println("então vamos lá com a sequencia de fibonacci");
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite a quantidade de vezes: ");
        int x = scanner.nextInt();
        int a = 0;
        int b = 1;
        int c;
        for (int i = 1; i < x; i++) {

            c = a + b;

            System.out.println(c);

            a = b;
            b = c;


        }     
        

        scanner.close(); 
    }
}