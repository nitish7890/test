import java.util.*;
public class InsertionSort{
   public static void main(String args[]){
      int i,j,temp;
   Scanner in=new Scanner(System.in);
   System.out.println("Enter the element of the array list");
   int a[]=new int[5];
   for(i=0;i<5;i++){
      a[i]=in.nextInt();
    }
   System.out.println("Before sorting the element");
    for(i=0;i<5;i++){
      System.out.print("\t"+a[i]+"\n");
   }
   for(i=1;i<5;i++){
        temp=a[i];
        j=i-1;
       while(j>=0 && a[j]>temp){
           a[j+1]=a[j];
            j=j-1;
       }
       a[j+1]=temp;
  }
   System.out.println("After sorting the element");
    for(i=0;i<5;i++){
      System.out.print("\t"+a[i]);
}
}
} 