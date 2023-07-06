        import java.util.Scanner;
        public class Exercicio13 {
        public static void main(String[] args) {
        Scanner Product = new Scanner(System.in);
        System.out.print("\nDigite o valor do produto: ");
        double value = Product.nextDouble();
        System.out.print("Quantia comprada: ");
        double qnt = Product.nextDouble();
        double result = value * qnt;
        System.out.println("A quantia total é de: "+result+"$");
        }
        }
