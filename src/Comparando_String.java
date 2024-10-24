public class Comparando_String
{
    public static void main(String[] args)
    {
        String nome = "Maria";
        String nome2 = "Maria";
        String nome3 = new String("Maria");
        String respota;
        respota = (nome.equals(nome3)) ? "igual" : "diferente";
        System.out.println(respota);

    }
}
