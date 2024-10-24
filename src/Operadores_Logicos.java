public class Operadores_Logicos
{
    public static void main(String[]args)
    {
        int x,y,z;
        x= 4;
        y= 6;
        z= 12;
        boolean resp;
        resp = (x < y && y==z) ? true : false;
        System.out.println(resp);
    }
}
