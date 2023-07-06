        import java.util.Scanner;
        public class Exercicio8 {
        public static void main(String[] args) {
        Scanner Product = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        int Amount = Product.nextInt();
        double Descont = Amount* 0.1;
        double Result = (Descont - Amount);
        System.out.println("Voce ganhou um desconto de 10% ao comprar este produto, sua conta sera de "+Result+"$\nAgradecemos a sua compra! (ɔ◔‿◔)ɔ ♥");
        }
        }
