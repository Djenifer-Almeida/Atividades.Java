        import java.util.Scanner;
        public class Exercicio16 {
        public static void main(String[] args) {
        Scanner Porcent = new Scanner(System.in);
        System.out.print("Valor do produto: ");
        double Product = Porcent.nextDouble();
        System.out.print("Valor da Porcentagem de desconto do produto: ");
        double Pct = Porcent.nextDouble();
        double Result = Product*(Pct/100);
        System.out.println("Valor total do produto com desconto: "+Result);
        }
        }
