import java.util.Scanner;
public class Operadores_Ternarios {
  public static void main(String[] args) {
    // Calificaciones examen
    Scanner entrada = new Scanner(System.in);
      System.out.println("Introduce tu calificación del parcial: ");
    double calificacion = entrada.nextDouble();

    if (calificacion > 6){
      System.out.println("Aprobado");
    } else {
      System.out.println("Reprobado");
    }

    // Validacion de numero mayor
      System.out.println("Introduce el primer numero: ");
    double numeroUno = entrada.nextDouble();
      System.out.println("Introduce el segundo numero: ");
    double numeroDos = entrada.nextDouble();
      System.out.println("Introduce el tercer numero: ");
    double numeroTres = entrada.nextDouble();

    if (numeroUno > numeroDos && numeroUno > numeroTres) {
      System.out.println("El numero uno es el mayor de todos " + numeroUno);
    } else if (numeroDos > numeroUno && numeroDos > numeroTres) {
      System.out.println("El numero dos es el mayor de todos " + numeroDos);
    } else if (numeroTres > numeroUno && numeroTres > numeroDos) {
      System.out.println("El numero tres es el mayor de todos " + numeroTres);
    } else {
      System.out.println("Algunos numeros o todos son iguales");
    }

    // Optimizacion de codigo
    double maximo = (numeroUno > numeroDos)? numeroUno:numeroDos;
    maximo = (maximo > numeroTres)? maximo:numeroTres;
      System.out.println("El maximo de los tres numeros es: " + maximo);

  }
}
