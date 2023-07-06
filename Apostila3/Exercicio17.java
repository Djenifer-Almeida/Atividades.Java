        import java.util.Scanner;
        public class Exercicio17 {
        public static void main(String[] args) {
        Scanner Count = new Scanner(System.in);
        System.out.print("Valor do produto: ");
        double Product = Count.nextDouble();
        System.out.print("Quantidade de parcelas: ");
        double part = Count.nextDouble();
        double Result = Product/part;
        System.out.println("Valor total: "+Result);
        }
        }
