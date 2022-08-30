public class insertatendSLL
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


  public void insertend(int val)
  {
   Node endnode=new Node(val);
   if(head==null)
    {
      head=endnode; 
      return ;
    }
    else
    {
   Node current=head;
   while(current.next!=null)
   {
    current=current.next;
   }
   current.next=endnode;
   endnode=current;
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
  insertatendSLL obj=new insertatendSLL();

/////////insertion at end

  obj.insertend(10);
   obj.insertend(20);
  obj.insertend(30);


 obj.display();
 }
}