        import java.util.Scanner;
        public class Exercicio21{
        public static void main(String[] args){
        Scanner imc = new Scanner(System.in);
        System.out.print("Digite a sua altura: ");
        double Height = imc.nextDouble();
        System.out.print("Digite seu peso: ");
        double weight = imc.nextDouble();
        double Result = weight /(Height*Height);
        System.out.println("Valor do imc: "+Result);
        }
        }
