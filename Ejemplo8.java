import java.util.*;
class Main {  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    double f,a,b;
    
    System.out.println("Ingrese a: ");
    a = sc.nextDouble();
    System.out.println("Ingrese b: ");
    b = sc.nextDouble();

    System.out.println("resultado de f: "+resultadoF(a,b));
    
  }
  
   public static Double resultadoF(double a , double b)
    {
      double f = ((a*a*a) + (b*b*b*b)) / (b-a+3) ;
        return f;
    }
}
