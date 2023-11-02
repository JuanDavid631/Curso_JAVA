public class Operadores_Precedencia {
  public static void main(String[] args) {
    int numero = 18, numeroDos = 15, numeroTres = 5;
    double promedio = (++numero + --numeroDos + numeroTres) / 3d;
      System.out.println(promedio);
  }
}
