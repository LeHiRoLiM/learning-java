import java.util.Scanner;

public class Resto
{
    public static void main(String[] args)
    {
        System.out.println("Qual o primeiro número: ");
        Scanner pnum = new Scanner(System.in);
        int primeiro = pnum.nextInt();

        System.out.println("Qual o segundo número: ");
        Scanner omun = new Scanner(System.in);
        int segundo = omun.nextInt();

        float resto = (primeiro + segundo)/2;
        System.out.println("O resto da soma desses dois núumeros é "+resto);
    }
}
