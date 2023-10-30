public class ConversionCadenas_Primitivas {
  public static void main(String[] args) {
    String booleano = "true";
    Boolean booleanConvertido = Boolean.parseBoolean(booleano);
      System.out.println(booleanConvertido);
    String decimals = "2.56";
    double decimalsConvertido = Double.parseDouble(decimals);
      System.out.println(decimalsConvertido);
    String entero = "395";
    int enteroConvertido = Integer.parseInt(entero);
      System.out.println(enteroConvertido);
    String flotante = "2.56e2f";
    float flotanteConvertido = Float.parseFloat(flotante);
      System.out.println(flotanteConvertido);
  }
}