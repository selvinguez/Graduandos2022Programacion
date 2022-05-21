import java.util.*;
class Main {  
  public static void main(String args[]) { 
     Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese el nombre : ");
     String nombre = leer.next();
     System.out.println("Ingrese la edad: ");
     int edad = leer.nextInt();
     if(edad >= 21 && edad <=60){
        System.out.println( nombre+"\t es mayor de edad");
     }else if(edad >= 0 && edad <=20){
        System.out.println( nombre+"\t es menor de edad");
     }else{
        System.out.println( nombre+"\t es de tercera edad");
     }
     
  } 
}
