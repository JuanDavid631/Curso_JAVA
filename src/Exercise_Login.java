import java.util.Scanner;

public class Exercise_Login {
  public static void main(String[] args) {
    String user = "Juan", password = "12345";
    Scanner entrada = new Scanner(System.in);
      System.out.println("Introduce tu usuario: ");
    String usuario = entrada.nextLine();
      System.out.println("Introduce tu contraseña: ");
    String contrasena = entrada.nextLine();
    // Funcion inicial
    if (user.equals(usuario) && password.equals(contrasena)){
      System.out.println("Datos autenticados, BIENVENIDO");
    } else {
      System.out.println("Datos incorrectos, intente de nuevo");
    }
  }
}
