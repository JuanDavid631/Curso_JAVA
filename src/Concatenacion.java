public class Concatenacion {
  public static void main(String[] args) {
    String saludo = "Hola, gracias por la informacion ";
    String nombre = "Juan";
    String saludoPersonalizado = saludo + nombre;
    String saludoPersonalizadoDos = saludo.concat("querido ").concat(nombre);
    String saludoPersonalizadoTres = saludo + "querido " + nombre;
      System.out.println(saludoPersonalizado);
      System.out.println(saludoPersonalizadoDos);
      System.out.println(saludoPersonalizadoTres);
  }
}
