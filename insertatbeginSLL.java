public class insertatbeginSLL
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
 
  public void insertbegin(int val)
  {
   Node newnode=new Node(val);
  newnode.next=head;
  head=newnode;
   }
  public int count()
 {  
  if(head==null)
  {
   return 0;
  }
else
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
  insertatbeginSLL obj=new insertatbeginSLL();
 // obj.head=new Node(10);
 // Node second=new Node(20);
//  Node third=new Node(30);
 // Node fourth=new Node(40);

  //mapping
  
 // obj.head.next=second;
 // second.next=third;
 // third.next=fourth;
 // fourth.next=null;



///////insertion at begin

  obj.insertbegin(10);
  obj.insertbegin(20);
   obj.insertbegin(30);
 obj.display();
System.out.println("Length of singly linked list is :" + obj.count());
 }
}