class DeleteatposSLL
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
public void deletePos(int pos)
{
    if(pos==1)
    {
        head=head.next;
    }
    else{
        Node current=head;
        Node previous=null;
        int count=1;
        while(count<pos-1)
        {
            current=current.next;
            count++;
        }
        
         previous=current.next;
         current.next=previous.next;
         previous=null;
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
   DeleteatposSLL obj=new DeleteatposSLL();

/////////insertion at at pos

  obj.insertend(10);
   obj.insertend(20);
  obj.insertend(30);
  obj.insertend(55);
  obj.insertend(36);

System.out.println("Nodes present in the list are :");
 obj.display();
 obj.deletePos(3);
 System.out.println("Nodes present after deleting at pos are :");
 obj.display();
 }
}