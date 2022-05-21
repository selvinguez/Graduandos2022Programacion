import java.util.*;
class Main {  
  public static void main(String args[]) { 
     Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese numero 1: ");
     int numero1 = leer.nextInt();
    System.out.println("Ingrese numero 2: ");
    int numero2 = leer.nextInt();
    System.out.println("Numero 1 -> "+numero1+"\tNumero 2 -> "+numero2); 
    System.out.println("Resultado de la suma -> \t"+(numero1+numero2));
    System.out.println("Resultado de la resta -> \t"+(numero1-numero2));
    System.out.println("Resultado de la multiplicacion -> \t"+(numero1*numero2));
    System.out.println("Resultado de la division -> \t"+(numero1/numero2));
  } 
}
