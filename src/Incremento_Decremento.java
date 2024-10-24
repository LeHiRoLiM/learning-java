public class Incremento_Decremento
{
    public static void main(String[] args)
    {
//        DECREMENTO
        int numero = 10;
        int valor = 5 + numero++;
        System.out.println("("+valor + " Decremento");
        System.out.println(numero + " Decremento)");
//        O 5 soma primeiro com 1 depois com a variável 10.

//        PRÉ-INCREMENTO
        int val = 10;
        int val2 = ++val + val;
        System.out.println(val2 +" PRÉ-INCREMENTO");
         /*
          * `++val` é uma operação de pré-incremento. Significa
          * que `val` será incrementado em 1 antes de ser usado
          * na expressão. - Assim, `++val` irá incrementar `val`
          * de 10 para 11. - Então a expressão `++val + val` se torna
          * `11 + 11`, pois `val` já foi incrementado e é usado com seu
          * valor atualizado novamente. - O valor resultante, `22`, é
          * atribuído a `val2`.
        */

//        INCREMENTO
        int valu = 10;
        int tot = 5 + ++valu;
        System.out.println(tot+" INCREMENTO");
        /*
        * O 5 está somando primeiro com + 1 depois com o valor de valu.
         */

    }
}
