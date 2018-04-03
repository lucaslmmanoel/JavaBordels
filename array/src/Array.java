import java.util.*;  
class TestCollection1{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
  list.add("Código");//Adding object in arraylist  
  list.add("Tipo");  
  list.add("Nome");  
  list.add("Valor");  
  //Traversing list through Iterator  
  Iterator itr=list.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}