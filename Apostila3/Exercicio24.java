        import javax.xml.transform.Result;
        import java.util.Scanner;
        public class Exercicio24 {
        public static void main(String[] args) {
        Scanner tabuada = new Scanner(System.in);
        System.out.print("Valor da tabuada: ");
        int valor = tabuada.nextInt();
        for (int i = 0; i < 10; i++){
        System.out.println(valor+" X "+i+" = "+(valor*i));
        }
        }
        }

