public class Operadores_Incremento_Decremento {
  public static void main(String[] args) {
    int valor = 5;
    // Incremento en uno y luego devuelve el numero
    int incremento = ++valor;
      System.out.println("Numero incrementado: " + incremento);
    // Devuelve el numero y luego incrementa
    valor = 5;
    int numeroAntes = valor++;
      System.out.println("Numero incrementado a validar : " + numeroAntes);

    // Decrementa en uno y luego devuelve el numero
    valor = 5;
    int decremento = --valor;
    System.out.println("Numero decrementado: " + decremento);
    // Devuelve el numero y luego incrementa
    valor = 5;
    int numeroDecrementaAntes = valor--;
    System.out.println("Numero decrementado a validar : " + numeroDecrementaAntes);
  }
}
