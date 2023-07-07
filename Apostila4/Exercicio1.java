        import java.util.Scanner;
        public class Exercicio1 {
        public static void main(String[] args) {
        Scanner idadeM = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String Name = idadeM.nextLine();
        System.out.print("Digite a sua idade: ");
        int year = idadeM.nextInt();
        if(year>18){
        System.out.println("O usuario "+Name+" é maior de idade");
        }else{
        System.out.println("O usuario "+Name+" é menor de idade");
        }
        }
        }
