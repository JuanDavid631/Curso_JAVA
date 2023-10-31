public class ExtensionArchivo {
  public static void main(String[] args) {
    String archivo = "imagen_generica.png";
    int numero = archivo.lastIndexOf(".");
      System.out.println(archivo.length());
      System.out.println(archivo.substring(numero + 1));
  }
}
