        import java.util.Scanner;
        public class Exercicio2 {
        public static void main(String[] args) {
        Scanner Circle = new Scanner(System.in);
        System.out.print("Digite o raio do circulo: ");
        double raio = Circle.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A area so circulo é: "+area);
        }
        }