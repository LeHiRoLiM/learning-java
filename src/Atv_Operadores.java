import java.util.Scanner;

public class Atv_Operadores {
    public static void main(String[] args) {
        System.out.println("++++++++++++++++++++");
        System.out.println("    Você Vota ?     ");
        System.out.println("++++++++++++++++++++");

        System.out.println("Qual seu nome ?");
        int crianca;
        Scanner name = new Scanner(System.in);
        String nome = name.nextLine();

        System.out.println("Qual seu ano de Nascimento " + nome + " ? ");
        Scanner year = new Scanner(System.in);
        int nasc = year.nextInt();

        int ano = 2024 - nasc;

        if (ano < 16) {
            System.out.println("Você tem " + ano + " e não pode votar " + nome + " !");
        } else if ((ano >= 16 && ano <= 17) || (ano > 70)) {
            System.out.println(nome + " seu voto é opcional, pois você tem " +ano+ " anos !");
        }
         if (ano >= 18 && ano <= 70)
         {
             System.out.println(nome+ " você vota, pois tem " + ano + " anos !");
         }
    }
}