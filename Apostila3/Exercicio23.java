        import java.util.Scanner;
        public class Exercicio23 {
        public static void main(String[] args) {
        Scanner Classe = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = Classe.nextInt();
        double Raiz = Math.sqrt(num);
        double Elevar = Math.pow(num,num);
        System.out.println("A raiz do num "+num+" é "+Raiz+"\nA potenciaçao de "+num+" é "+Elevar);
        }
        }
