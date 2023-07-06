        import java.util.Scanner;
        public class Exercicio15{
        public static void main(String[] args){
        Scanner imc =  new Scanner(System.in);
        System.out.println("\nUse virgula ao testar o programa!\nEx: Altura = 1,58 Peso = 55,00");
        System.out.print("\nDigite a sua altura: ");
        double Height = imc.nextDouble();
        System.out.print("Digite o seu peso: ");
        double Weight = imc.nextDouble();
        double Result = Weight/(Height*Height);
        System.out.println("Indice da massa corporal: "+Result);
        }
        }
