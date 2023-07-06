        import java.util.Scanner;
        public class Exercicio18 {
        public static void main(String[] args) {
        Scanner Birth = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int age = Birth.nextInt();
        System.out.print("Digite o ano atual: ");
        int year = Birth.nextInt();
        int Result = (age - year);
        System.out.println("O ano que voce nasceu é:"+Result);
        }
        }
