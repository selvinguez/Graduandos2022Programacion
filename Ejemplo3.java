import java.util.*;
class Main {  
  public static void main(String args[]) { 
    List<Integer> list=new ArrayList<Integer>();
    list.add(4);  
    list.add(6);  
    list.add(7);  
    list.add(8); 
    
    int i = 0;
    while(i<list.size()){
      System.out.println(list.get(i));
      i++;
    }
  } 
}
