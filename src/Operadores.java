public class Operadores {
  public static void main(String[] args) {
    // Operador de asignacion =
      int numero = 9;
    // Operadores aritmeticos +, -, *, /, %
      int suma = 9 + 9;
      int resta = 9 - 5;
      int multiplicacion = 8 * 5;
      int division = 4 / 2;
      int modulo = 20 % 7;
    // Operadores aritmeticos incrementales
      int aumento = numero++;
      int aumentoVariable = ++numero;
      int decremento = suma--;
    // Operadores aritmeticos combinados
      int sumaCombinada = aumento += suma;
      int restaCombinada = decremento -= resta;
      int productoCombinado = aumentoVariable *= suma;
      int divisionCombinada = decremento /= suma;
      int restoCombinado = modulo %= resta;
    // Operadores de relacion
      boolean valor = 9 == 8;
      boolean distince = 'a' != 'b';
      boolean menor = 8 < 6;
      boolean mayor = 8 > 3;
      boolean menorIgual = 8.36 <= 8;
      boolean mayorIgual = 'A' >= 'a';
    // Operadores Logicos o booleanos
      boolean uno = !(5 == 5);
      boolean dos = (5 == 5) | (5 < 4);
      boolean tres = true ^ false;
      boolean cuatro = (5 == 5) || (5 < 4);
      boolean cinco = (5 == 5) && (5 < 4);
  }
}
