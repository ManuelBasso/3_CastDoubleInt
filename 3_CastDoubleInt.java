//Scrivere uno snippet di codice che dati 2 numeri con la virgola(double) li sommi e li stampi senza virgola (int).

public class CastDoubleInt {
    public static void main(String args[]) {
      double first = 12.1;
      double second = 2.2;
      int somma = (int)first + (int)second;
      
      System.out.println("Sum 1st and 2nd integer = " + somma);
    }
}