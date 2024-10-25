import java.util.Scanner;

public class Qual_Maior_Valor {
    public static void main(String[] args) {

        System.out.print("Digite o Primeiro valor:");
        Scanner resp = new Scanner(System.in);
        int reposta = resp.nextInt();

        System.out.print("Digite o Segundo valor: ");
        Scanner respi = new Scanner(System.in);
        int respostinha = respi.nextInt();

        if (reposta == respostinha) {
            System.out.println("Escreva um valor diferente por favor: ");
            Scanner rep = new Scanner(System.in);
            int reps = rep.nextInt();
        }
        if (reposta == respostinha)
        {
            System.out.println();
        }
        if (reposta > respostinha) {
            System.out.println("O maior valor é " + resp);
        } else if (respostinha > reposta)
        {
            System.out.println("O maior valor é " + respostinha);
        }
    }
}
