
public class Stack2 {
	  Node head;
	    public class Node{
	     int value;
	     Node next;
	   }
	 Stack2(){
	     head=null;
	  }
	public void push(int value){
	  Node temp=head;
	  head=new Node();
	  head.value=value;
	  head.next=temp;
	 }
	public int pop(){
	  if(head==null){
	    System.out.println("Stack is empty");
	  }
	  int value=head.value;
	  head=head.next;
	  return(value);
	}
	public static void display(Node head) {
		Node temp2=head;
		while(temp2!=null) {
			System.out.println(temp2.value);
			temp2=temp2.next;
		}
	}
	public static void main(String args[]){
	  Stack2 ob=new Stack2();
	  
	  ob.push(10);
	  ob.push(20);
	  ob.push(30);
	  ob.push(40);
	  display(ob.head);
	  System.out.println("Deleted element=");
	  System.out.println(ob.pop());
	}
	}

