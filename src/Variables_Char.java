public class Variables_Char {
  public static void main(String[] args) {
    // UNICODE
      char simboloTres = '\u0026';
    // ASCII - Combinacion de teclas en el teclado
      char simboloDos = 38;
    // CAR - Simbologia como el teclado lo muestra
      char simbolo = '&';
          System.out.println("Codigo CAR: " + simbolo);
          System.out.println("Codigo ASCII: " + simboloDos);
          System.out.println("Codigo UNICODE: " + simboloTres);

    // Secuencias de escape y caracteres especiales
    char saltoLinea = '\n';
    char retroceso = '\b';
    char tabulador = '\t';
    char principioLinea = '\r';
    char newPage = '\f';
    char comillas = '\"';
    char comillaSimple = '\'';
    char barraInversa = '\\';
  }
}
