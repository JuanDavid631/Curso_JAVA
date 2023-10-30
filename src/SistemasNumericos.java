public class SistemasNumericos {
  public static void main(String[] args) {
    int numero = 450;
        System.out.println("Nuestro numero es: " + numero);
    String numeroBinario = Integer.toBinaryString(numero);
        System.out.println("Numero en binario: " + numeroBinario);
        System.out.println("Numero en binario escrito en Java: " + 0b111000010);
        System.out.println("Numero en hexadecimal: " + Integer.toHexString(numero));
        System.out.println("Numero en hexadecimal escrito en Java: " + 0x1c2);
        System.out.println("Numero en Octal: " + Integer.toOctalString(numero));
        System.out.println("Numero en Octal escrito en Java: " + 0702);
  }
}
