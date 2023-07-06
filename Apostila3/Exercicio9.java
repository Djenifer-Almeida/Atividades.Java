        import java.util.Scanner;
        public class Exercicio9 {
        public static void main(String[] args) {
        Scanner Amount = new Scanner(System.in);
        System.out.print("Digite a quantidade de litros de combustivel: ");
        double litre = Amount.nextDouble();
        System.out.print("Valor do litro: ");
        double Value = Amount.nextDouble();
        double Total = litre * Value;
        System.out.println("O valor a ser pago sera: "+Total);
        }
        }
