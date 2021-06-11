import java.util.*;
public class BubbleSort{
   public static void main(String args[]){
      int i,j,temp;
   Scanner in=new Scanner(System.in);
   System.out.println("Enter the element of the array list");
   int a[]=new int[5];
   for(i=0;i<5;i++){
      a[i]=in.nextInt();
    }
  
    for(i=0;i<5-1;i++){
        for(j=0;j<5-i-1;j++){
            if(a[j]>a[j+1]){
              temp=a[j];
              a[j]=a[j+1];
              a[j+1]=temp;
          }
        }
     }   
 System.out.println("After sorting the array list");  
 for(i=0;i<5;i++){
  System.out.println(a[i]);
 }
}
}  
   
