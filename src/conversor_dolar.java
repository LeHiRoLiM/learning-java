import java.util.Scanner;

public class conversor_dolar
{
    public static void main(String[] args)
    {
        String head = "Bem-Vindo ao Conversor de Real para Dolar";
        String nome = "Qual seu nome ?";
        System.out.println("---------------------------------------------");
        System.out.println(head);
        System.out.println("---------------------------------------------");

        System.out.println(nome);
        Scanner head2 = new Scanner(System.in);
        String name = head2.nextLine();

        System.out.println("Olá " + name + ", qual o valor em R$ ?");
        Scanner ler = new Scanner(System.in);
        int dolar;
        dolar = ler.nextInt();
        double div = dolar / 5.47;
        System.out.printf("O valor convertido é: %.2f", div);
    }
}
