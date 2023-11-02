public class Operadores_Instanceof {
  public static void main(String[] args) {
    String texto = "Hola, ¿como estas?";
    Integer numero = 6;
    boolean validar = texto instanceof String;
      System.out.println(validar);
    validar = texto instanceof Object;
      System.out.println(validar);
    validar = numero instanceof Integer;
      System.out.println(validar);
    validar = numero instanceof Object;
      System.out.println(validar);

    Number numeroDos = 9;
    validar = numeroDos instanceof Long;
      System.out.println(validar);
    validar = numeroDos instanceof  Double;
      System.out.println(validar);
    validar = numeroDos instanceof Float;
      System.out.println(validar);

    Number numeroTres = 6.32f;
    validar = numeroTres instanceof  Double;
      System.out.println(validar);
  }
}
