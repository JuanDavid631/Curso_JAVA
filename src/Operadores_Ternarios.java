import java.util.Scanner;
public class Operadores_Ternarios {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
      System.out.println("Introduce tu calificación del parcial: ");
    double calificacion = entrada.nextDouble();

    if (calificacion > 6){
      System.out.println("Aprobado");
    } else {
      System.out.println("Reprobado");
    }
  }
}
