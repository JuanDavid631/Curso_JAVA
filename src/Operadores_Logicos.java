public class Operadores_Logicos {
  public static void main(String[] args) {
    int valor = 7, numero = 5;
    boolean mentira = false;
    boolean validar = (valor < numero || valor == numero);
    boolean validarDos = (valor > numero || valor == numero);
    boolean validarTres = (valor < numero && valor == numero);
    boolean validarCuatro = (valor > numero && valor == numero);
    boolean otro = (valor > numero && mentira == true);
      System.out.println("Validacion primera que se cumpla una condicion: " + validar + "\nValidacion segunda que se cumpla una condicion: " + validarDos
                          + "\nValidacion tercera que se cumplan ambas condiciones: " + validarTres + "\nValidacion cuarta que se cumplan ambas condiciones: " + validarCuatro);
      System.out.println("Validaciones logicas o numericas: " + otro);

    boolean nuevo = (valor > numero || valor == numero) || (mentira == false);
    boolean nuevoDos = (valor < numero || valor == numero) || (mentira == true);
    boolean nuevoTres = ((valor > numero && mentira == true) || (valor == numero && valor < numero)) && (mentira == false);
    boolean nuevoCuatro = ((valor > numero && mentira == false) || (valor == numero && valor < numero)) && (mentira == false);
      System.out.println("\nPrecedencia de los operadores: " + nuevo + "\nPrecedencia de los operadores: " + nuevoDos + "\nPrecedencia de los operadores: " + nuevoTres
                        + "\nPrecedencia de los operadores: " + nuevoCuatro);
  }
}
