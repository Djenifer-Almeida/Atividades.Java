        import java.util.Scanner;
        public class Exercicio3 {
        public static void main(String[] args) {
        Scanner triangle = new Scanner(System.in);
        System.out.print("Digite a base do triangulo: ");
        double base = triangle.nextDouble();
        System.out.print("Digite a altura do triangulo: ");
        double height = triangle.nextDouble();
        double area = (base * height)/2;
        System.out.println("A area do triangulo é: "+area);
        }
        }
