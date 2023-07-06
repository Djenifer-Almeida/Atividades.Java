        import java.util.Scanner;
        public class Exercicio25 {
        public static void main(String[] args) {
        Scanner Change = new Scanner(System.in);
        System.out.println("Quer ver algo maneiro?\nDigite 2 numeros abaixo e veja o que acontece!! (ɔ◔‿◔)ɔ \n");
        int A, B, aux;
        System.out.print("A: ");
        A = Change.nextInt();
        System.out.print("B: ");
        B = Change.nextInt();
        aux = A;
        A = B;
        B = aux;
        System.out.println("\nA: "+A);
        System.out.println("B: "+B);
        System.out.println("Maneiro né? (>‿◠)✌");
        }
        }
