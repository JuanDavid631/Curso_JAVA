public class ConversionPrimitivas_Cadenas {
  public static void main(String[] args) {
    boolean cierto = true;
    String ciertoConvertido = Boolean.toString(cierto);
    double decimals = 2.56;
    String decimalsConvertido = Double.toString(decimals);
    int entero = 395;
    String enteroConvertido = Integer.toString(entero);
    float flotante = 2.56e2f;
    String flotanteConvertido = Float.toString(flotante);
    String mensaje = ciertoConvertido + "\n" + decimalsConvertido + "\n" + enteroConvertido + "\n" + flotanteConvertido;
      System.out.println(mensaje);
  }
}
