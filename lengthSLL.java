public class lengthSLL
{
 private Node head;
	private static class Node
  	{
      int data;
	 Node next;
     
     public Node(int value)
     {
      this.data=value;
	 this.next=null;
     }
    }
 
  public int count()
 {  
  int len=0;
  Node current=head;
  while(current!=null)
  {
   current=current.next;
   len++;
  }
 return len;
 }

  public void display()
  {
   Node current=head;
   while(current!=null)
   {
    System.out.print(current.data + "->");
    current=current.next;
   }
   System.out.println("null");
  } 
public static void main(String args[])
{
  lengthSLL obj=new lengthSLL();
  obj.head=new Node(10);
  Node second=new Node(20);
  Node third=new Node(30);
  Node fourth=new Node(40);

  //mapping
  
  obj.head.next=second;
  second.next=third;
  third.next=fourth;
  fourth.next=null;

 obj.display();
System.out.println("Length of singly linked list is :" + obj.count());
 }
}