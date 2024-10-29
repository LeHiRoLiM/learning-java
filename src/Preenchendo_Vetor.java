import java.util.Arrays;

public class Preenchendo_Vetor
{
    public static void main(String[] args)
    {
       int[] a = new int[10];
        Arrays.fill(a,0); /* Preenche todos os espaços */
        for (int b: a)
        {
            System.out.print(b + " ");
        }
    }
}
