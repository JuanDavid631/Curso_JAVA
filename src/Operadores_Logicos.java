public class Operadores_Logicos {
  public static void main(String[] args) {
    int valor = 7, numero = 5;
    boolean mentira = false;
    boolean validar = (valor < numero || valor == numero);
    boolean validarDos = (valor > numero || valor == numero);
    boolean validarTres = (valor < numero && valor == numero);
    boolean validarCuatro = (valor > numero && valor == numero);
      System.out.println("Validacion primera que se cumpla una condicion: " + validar + "\nValidacion segunda que se cumpla una condicion: " + validarDos
                          + "\nValidacion tercera que se cumplan ambas condiciones: " + validarTres + "\nValidacion cuarta que se cumplan ambas condiciones: " + validarCuatro);
  }
}
