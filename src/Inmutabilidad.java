public class Inmutabilidad {
  public static void main(String[] args) {
    String saludo = "Hola, gracias por la informacion ";
    String nombre = "Juan";
    String nombreUno = "Jhan";
    String saludoPersonalizado = saludo + nombre;
      System.out.println(saludoPersonalizado);
    saludo =  saludo.transform(nuevo -> {
      return nuevo + "estimado " + nombre;
    });
      System.out.println(saludo + " --> Transformado");
    nombreUno = nombreUno.replace("a", "o");
      System.out.println(nombreUno + " --> Reemplazo");
  }
}
