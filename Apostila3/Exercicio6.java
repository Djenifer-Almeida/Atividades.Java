        import java.util.Scanner;
        public class Exercicio6{
        public static void main(String[] args){
        Scanner calculo = new Scanner(System.in);
        System.out.print("Digite quantidade de dias: ");
        int day = calculo.nextInt();
        System.out.print("Digite as Horas: ");
        int Hour = calculo.nextInt();
        System.out.print("Digite os minutos: ");
        int minutes = calculo.nextInt();
        System.out.print("Digite a quantidade de segundos: ");
        int secondes = calculo.nextInt();
        int totalSecondes = (day * 24 * 60 * 60) + (Hour * 60 * 60) + (minutes * 60) + secondes;
        System.out.println("O tempo total em segundos é: " + totalSecondes);
        }
        }
