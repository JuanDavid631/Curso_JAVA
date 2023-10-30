import java.util.Locale;

public class MetodosImportantes_Strings {
  public static void main(String[] args) {
    String nombre = "Juan";
      System.out.println(nombre.toUpperCase(Locale.ROOT) + " --> Conversion a mayusculas");
      System.out.println(nombre.toLowerCase(Locale.ROOT) + " --> Conversion a minusculas");
      System.out.println(nombre.equals("juan") + " --> Valida el contenido de la variable");
      System.out.println(nombre.equalsIgnoreCase("juan") + " --> Ignora como este declarada la variables");
      System.out.println(nombre.compareTo("Andres") + " --> Comparacion de pasos para llegar de una palabra a otra");
      System.out.println(nombre.charAt(0) + " --> Primer caracter de la variable");
      System.out.println(nombre.charAt(nombre.length()-1) + " --> Ultimo caracter de la variable");
      System.out.println(nombre.compareToIgnoreCase("Andres")+ " --> Ignora la comparacion de pasos para llegar de una palabra a otra");
      System.out.println(nombre.replace("J", "P") + " --> Reemplaza lo que se le pide");
      
  }
}
