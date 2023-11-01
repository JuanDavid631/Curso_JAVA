public class Operadores_Relacionales {
  public static void main(String[] args) {
    int valor = 7, numero= 5;
    boolean relacional = (valor == numero);
    boolean relacionalDos = !relacional;
    boolean relacionalTres = (valor != numero);
    boolean mentira = false;
    boolean relacionalCinco = (true == mentira);
    boolean relacionalSeis = (true != mentira);
      System.out.println("Logica inicial: " + relacional + "\nCambio de logica: " + relacionalDos + "\nDistinto a algo: " + relacionalTres
                          + "\nValidaciones: " + relacionalCinco+ "\nValidaciones: " + relacionalSeis);
  }
}
