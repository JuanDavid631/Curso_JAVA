public class Operadores_Relacionales {
  public static void main(String[] args) {
    int valor = 7, numero= 5;
    boolean relacional = (valor == numero);
    boolean relacionalDos = !relacional;
    boolean relacionalTres = (valor != numero);
    boolean mentira = false;
    boolean relacionalCinco = (true == mentira);
    boolean relacionalSeis = (true != mentira);
    boolean validar = (valor < numero);
    boolean validarDos = (valor > numero);
    boolean validarTres = (valor <= numero);
    boolean validarCuatro = (valor >= numero);
      System.out.println("Logica inicial: " + relacional + "\nCambio de logica: " + relacionalDos + "\nDistinto a algo: " + relacionalTres
                          + "\nValidaciones: " + relacionalCinco + "\nValidaciones: " + relacionalSeis + "\nValidaciones Mayor y Menor que: " + validar
                          + "\nValidaciones Mayor y Menor que: " + validarDos + "\nValidaciones Mayor o igual que: " + validarTres
                          + "\nValidaciones Mayor o igual que: " + validarCuatro);
  }
}
