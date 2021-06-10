import java.util.*;  
class Hashtable1{  
 public static void main(String args[]){  
 Hashtable<Integer,String> str=new Hashtable<Integer,String>();  
  
  str.put(100,"To");  
  str.put(101,"be");  
  str.put(102,"or");  
  str.put(103,"not"); 
  str.put(104,"to");
  str.put(105,"be"); 
  
  for(Map.Entry m:str.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}