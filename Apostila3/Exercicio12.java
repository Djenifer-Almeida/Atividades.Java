        import java.util.Scanner;
        public class Exercicio12 {
        public static void main(String[] args) {
        Scanner Add = new Scanner(System.in);
        System.out.print("Valor do produto: ");
        int Value = Add.nextInt();
        double Acresc = Value * 0.15;
        double Result = Value + Acresc;
        System.out.println("Seu produto recebeu um acrescimo de 15% total: "+Result);
        }
        }
