import java.lang.reflect.Array;
import java.util.Arrays;

public class For_Para_Vetor
{
    public static void main(String[] args)
    {
        double[] a = {2.3, 1.4, 5.8};
        Arrays.sort(a);  /* Para colocar em ordem */
        for (double val: a)
        {
            System.out.println("Valor " + val);
        }
    }
}
