        import java.util.Scanner;
        public class Exercicio22 {
        public static void main(String[] args) {
        Scanner Cadastro = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String name = Cadastro.nextLine();
        System.out.print("Digite a sua idade: ");
        int age = Cadastro.nextInt();
        System.out.print("Digite o nome da sua cidade: ");
        String city = Cadastro.next();
        System.out.println("Seu nome é "+name+" tem "+age+" anos e mora atualmente em "+city);
        }
        }
