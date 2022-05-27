import java.util.*;
class Main {  
  public static void main(String args[]) {
    //Expresiones
    //Declarando un variable sin asignarle un valor
    int m,v;
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese M");
    m = sc.nextInt();
     System.out.println("Ingrese V");
    v = sc.nextInt();
    // m v^2
    double resultado =m *(v*v) ;

    
    System.out.println("resultado de Fr: "+resultado);
    
  } 
}
