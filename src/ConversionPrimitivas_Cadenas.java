public class ConversionPrimitivas_Cadenas {
  public static void main(String[] args) {
    boolean cierto = true;
    String ciertoConvertido = Boolean.toString(cierto);
      System.out.println(ciertoConvertido);
    double decimals = 2.56;
    String decimalsConvertido = Double.toString(decimals);
      System.out.println(decimalsConvertido);
    int entero = 395;
    String enteroConvertido = Integer.toString(entero);
      System.out.println(enteroConvertido);
    float flotante = 2.56e2f;
    String flotanteConvertido = Float.toString(flotante);
      System.out.println(flotanteConvertido);
  }
}
