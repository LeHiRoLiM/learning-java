import java.util.Scanner;

public class Do_While
{
    public static void main(String[] args)
    {
        int num, soma = 0;
        String resposta;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um número: ");
            num = teclado.nextInt();
            soma += num;
            System.out.println("Quer continuar ? [S/N]");
            resposta = teclado.next();
        } while (resposta.equals("S")) ;
        System.out.println("A soma de todos os valores é " + soma);

    }
}
