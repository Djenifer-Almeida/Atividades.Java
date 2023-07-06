        import java.util.Scanner;
        public class Exercicio5 {
        public static void main(String[] args) {
        Scanner Workaday = new Scanner(System.in);
        System.out.print("Horas trabalhadas do funcionario: ");
        double Hour = Workaday.nextDouble();
        System.out.print("Salario a hora do funcionario: ");
        double Wage = Workaday.nextDouble();
        double payment = (Hour * Wage);
        System.out.println("Salario diario: "+payment);
        }
        }
