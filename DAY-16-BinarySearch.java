import java.util.*;
public class BinarySearch{
     public static void main(String args[]){
     int i,mid,item,n,pos=-1;
   Scanner in=new Scanner(System.in);
    System.out.println("Enter the size of the array list");
    n=in.nextInt();
   System.out.println("Enter the element of the array list");
   int a[]=new int[n];
   for(i=0;i<n;i++){
      a[i]=in.nextInt();
    }
  System.out.println("Enter the element to be seach");
   item=in.nextInt();
   int low=0;
   int high=n-1;
  while(low<=high){
      mid=(low+high)/2;
      if(a[mid]==item){
        pos=mid;
          break;
       }
      else if(a[mid]>item){
         high=mid;
       }
      else{
         low=mid;
     }
  }
  System.out.println("Seach is completed at position="+pos); 
  
   
  
  }
}
