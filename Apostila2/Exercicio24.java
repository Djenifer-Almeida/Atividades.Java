        import java.util.Scanner;
        public class Exercicio24 {
        public static void main(String[] args) {
        Scanner Cadastro = new Scanner(System.in);
        System.out.print("Nome: ");
        String name = Cadastro.nextLine();
        System.out.print("ENDEREÇO_\nRUA: ");
        String neighborhood = Cadastro.nextLine();
        System.out.print("Numero: ");
        int num = Cadastro.nextInt();
        System.out.print("CEP: ");
        double cep = Cadastro.nextDouble();
        System.out.print("Cidade: ");
        String City = Cadastro.next();
        System.out.print("Estado: ");
        String State = Cadastro.next();
        System.out.print("CPF: ");
        double Cpf = Cadastro.nextDouble();
        System.out.print("Telefone: ");
        int tel = Cadastro.nextInt();
        }
        }
