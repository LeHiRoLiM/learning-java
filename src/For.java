import java.util.Scanner;

public class For
{
    public static void main(String[] args)
    {
        for(int i = 10; i >=1; i-=1) {
            if ( i >= 3)
            {
                System.out.println(i + " patinhos foram passear\n" +
                        "Além das montanhas\n" +
                        "Para brincar\n" +
                        "A mamãe gritou: Quá, quá, quá, quá\n" +
                        "Mas só " + (i -1) + " patinhos voltaram de lá. \n");
            }else if ( i == 2)
            {
                System.out.println(i + " patinhos foram passear\n" +
                        "Além das montanhas\n" +
                        "Para brincar\n" +
                        "A mamãe gritou: Quá, quá, quá, Mas só um " + (i - 1) + " patinho voltou de lá.\n");
            } else System.out.println(i + " patinho foi passear\n" +
                        "Além das montanhas\n" +
                        "Para brincar\n" +
                        "A mamãe gritou: Quá, quá, quá, quá Mas infelizmente nenhum patinho voltou de lá. ");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("O que você acha que aconteceu com os patinhos ?");
        Scanner what = new Scanner(System.in);
        String resposta = what.nextLine();
        System.out.println("Quase, eles foram nadar...");
    }
}
