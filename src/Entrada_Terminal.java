import java.util.Scanner;
public class Entrada_Terminal {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
      System.out.println("Introduce un numero entero: ");
    int numeroReal = entrada.nextInt();
      System.out.print("Nuestro numero es: " + numeroReal);
    String numeroBinario = Integer.toBinaryString(numeroReal);
      System.out.println("Numero en binario: " + numeroBinario);
      System.out.println("Numero en hexadecimal: " + Integer.toHexString(numeroReal));
      System.out.println("Numero en Octal: " + Integer.toOctalString(numeroReal));
  }
}
