        import java.util.Scanner;
        public class Exercicio10 {
        public static void main(String[] args) {
        Scanner Rent = new Scanner(System.in);
        System.out.print("Quantidade de dias que o carro foi alugado: ");
        int Day = Rent.nextInt();
        System.out.print("Valor da diaria: ");
        double Value = Rent.nextDouble();
        double Result = Day * Value;
        System.out.println("O valor total do aluguel é: "+Result);
        }
        }