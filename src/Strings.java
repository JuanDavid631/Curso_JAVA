public class Strings {
  public static void main(String[] args) {
    String hola = "Hola, gracias por la informacion";
    String holaDos = "Hola, gracias por la informacion";
    String holaUno = new String("Hola, gracias por la informacion");
        System.out.println(hola + "--> Misma declaracion de variable" + "\n" + holaDos + "--> Misma declaracion de variable");
        System.out.println(holaUno + "--> Declaracion de variable distinta");
        System.out.print("Misma declaracion: ");
        System.out.println(hola == holaDos);
        System.out.println("Declaracion distinta: " + hola.equals(holaUno) + " y evalua por lo que esta adentro");
  }
}
