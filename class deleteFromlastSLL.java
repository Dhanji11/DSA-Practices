class deleteFromlastSLL
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
public Node deletelast()
{
    if(head==null||head.next==null)
        return head;
        Node current=head;
        Node previous=null;
        while(current.next!=null)
        {
         previous=current;
         current=current.next;
        }
        previous.next=null;
        return current;
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
   deleteFromlastSLL obj=new deleteFromlastSLL();

/////////insertion at end

  obj.insertend(10);
   obj.insertend(20);
  obj.insertend(30);

System.out.println("Nodes present in the list are :");
 obj.display();
 //obj.deletefromBegin();
System.out.println("deleted element from last are : "+ obj.deletelast().data);
 System.out.println("Nodes present after deleting the first element are :");
 obj.display();
 }
}