public class Vetor
{
    public static void main(String[] args)
    {
        String[] mes = {"Jan","Fev","Mar","Abr","Mai","Jun"};
        int[] dia = {31,28,31,30,31,30};
        for (int i = 0; i < mes.length; i++)
        {
            System.out.println(mes[i]+ " tem " + dia[i] + " dias.");
        }
    }
}
