import java.util.Scanner;

public class Switch_Condicao
{
    public static void main(String[] args)
    {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Vamos descobrir qual animal é esse !");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Quantas Pernas ?");
        Scanner a = new Scanner(System.in);
        int perna = a.nextInt();

        String tipo;
        System.out.print("Isso é um ");
        switch (perna)
        {
            case 1:
                tipo = "Saci !";
            break;
            case 2:
                tipo = "Bípede !";
                break;
            case 3:
                tipo = "Tripé !";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 5:
                tipo = "burro";
                break;
            case 6:
                tipo = "Estranho";
                break;
            default:
                tipo = "ET";
        }
        System.out.print(tipo);
    }

}
