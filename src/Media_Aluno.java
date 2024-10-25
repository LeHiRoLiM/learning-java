import java.util.Scanner;

public class Media_Aluno
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Primeira nota: ");
        float nota1 = teclado.nextFloat();
        System.out.println("Segunda nota: ");
        float nota2 = teclado.nextFloat();
        float media = (nota1 + nota2)/2;
        System.out.println(media);

        if (media > 7)
        {
            System.out.println("Parabéns");
        }else {
            System.out.println("Reprovado guri !");
        }
    }
}
