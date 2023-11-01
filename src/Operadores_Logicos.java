public class Operadores_Logicos {
  public static void main(String[] args) {
    int valor = 7, numero = 5;
    boolean mentira = false;
    boolean validar = (valor < numero || valor == numero);
    boolean validarDos = (valor > numero || valor == numero);

      System.out.println("Validacion primera: " + validar + "\nValidacion segunda: " + validarDos);
  }
}
