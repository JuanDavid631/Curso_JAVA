import javax.swing.*;
public class EntradaDatos {
  public static void main(String[] args) {
    String numero = JOptionPane.showInputDialog(null, "Ingresa un numero entero: ");
    int numeroReal = Integer.parseInt(numero);
      System.out.println("Nuestro numero es: " + numeroReal);
      String numeroBinario = Integer.toBinaryString(numeroReal);
      System.out.println("Numero en binario: " + numeroBinario);
      System.out.println("Numero en hexadecimal: " + Integer.toHexString(numeroReal));
      System.out.println("Numero en Octal: " + Integer.toOctalString(numeroReal));
      String resultados = "Nuestro numero es: " + numeroReal + "\nNumero en binario: " + numeroBinario + "\nNumero en hexadecimal: " + Integer.toHexString(numeroReal) + "\nNumero en Octal: " + Integer.toOctalString(numeroReal);
      JOptionPane.showMessageDialog(null, resultados);
  }
}
