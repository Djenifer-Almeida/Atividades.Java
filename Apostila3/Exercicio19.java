        import java.util.Scanner;
        public class Exercicio19 {
        public static void main(String[] args) {
        Scanner DayLife = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int Age = DayLife.nextInt();
        System.out.print("Digite a quantidade de meses vividos: ");
        int Month = DayLife.nextInt();
        int Result = Age*Month;
        System.out.println("Quantidade de dias vividos é de: "+Result);
        }
        }
