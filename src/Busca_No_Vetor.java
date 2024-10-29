import java.util.Arrays;

public class Busca_No_Vetor
{
    public static void main(String[] args)
    {
        int[] a= {3, 5, 7, 4, 2};
        for (int b: a)
        {
            System.out.println(b + " ");
        }
        int c = Arrays.binarySearch(a,3);
        System.out.println("Encontrei o número na posição " + c);
    }
}
