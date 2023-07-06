        import java.util.Scanner;
        public class Exercicio3 {
        public static void main(String[] args) {
        Scanner numint = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n1 = numint.nextInt();
        System.out.print("Digite um numero: ");
        int n2 = numint.nextInt();
        String conc = Integer.toString(n1) + Integer.toString(n2);
        System.out.println("Concatenação dos números: " + conc);
        }
        }
