public class Int_String {
public static void main(String [] args) {

    /** Como fazer um int dentro de uma String.
     *  Antes preciso saber que 'int' é um tipo primitivo
     *  e 'String' é uma classe invólucro. Para isso eu uso
     *  Srting value = Integer.toString(idade);
     *  (Integer) Classe invólucro
     *  (.toString) Método
      */
    int idade = 10;
    String value = Integer.toString(idade);
    System.out.println(value);

    /** Como fazer o contrário ?
     * Uso Wrapper class novamente, mas agora
     * usando 'parse' em vez de 'toString'.
     */
    String valor = "30";
    int numero = Integer.parseInt(valor);
    System.out.println(numero);



    /** Também posso fazer isso com valores reais.
     * Mas agora uso 'parseFloat'.
     */
    String val = "30.8";
    float idad = Float.parseFloat(val);
    System.out.printf("%.2f", idad);



}
}



