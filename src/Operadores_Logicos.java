public class Operadores_Logicos
{
    public static void main(String[]args)
    {
//        Operador e
        int x,y,z;
        x= 4;
        y= 6;
        z= 12;
        boolean resp;
        resp = (x < y && y==z) ? true : false;
        System.out.println(resp);

//        Operador ou
        int a,b,c;
        x= 4;
        y= 6;
        z= 12;
        boolean respi;
        respi = (x < y || y==z) ? true : false;
        System.out.println(respi);

    }
}
