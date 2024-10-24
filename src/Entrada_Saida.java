import java.util.Scanner;

public class Entrada_Saida
{
   public static void main(String[] args)
   {
       System.out.println("+++++++++++++++++++++++++");
       System.out.println("    Descobrir Idade      ");
       System.out.println("+++++++++++++++++++++++++");

       System.out.println("Qual seu nome ?");
       Scanner nome = new Scanner(System.in);
       String usuario = nome.nextLine();
       System.out.print("Qual o ano atual " + usuario + ": ");
       Scanner ano = new Scanner(System.in);
       int year = ano.nextInt();

       System.out.print("Qual sua data de nascimento: ");
       Scanner ida = new Scanner(System.in);
       int idade = ida.nextInt();

       int total = (year - idade);
       System.out.println("Você tem " + total + " anos " + usuario);

   }
}
