  //Program for singly lisnked list
  public class insertatposSLL{
    private Node head;
    private static class Node{
        int data;                        //node element
        Node next;
    
    public Node(int value)              //constructor
    {
      this.data=value;
      this.next=null;
    }
    
}
public void insertpos(int val,int pos)
 {
    Node newnode=new Node(val);
 if(pos==1)
 {
  newnode.next=head;
  head=newnode;
 }
else{
    Node prev=head;
    int i=1;
    while(i<pos-1){
    prev=prev.next;
    i++;
    }
    Node current=prev.next;
   newnode.next=current;
   prev.next=newnode;
}
 }
public void display()               //function to display nodes
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
   System.out.println("null");
    }
    public static void main(String args[])        //main function of class
    {
        insertatposSLL obj1=new insertatposSLL();
        obj1.head=new Node(10);
        Node second=new Node(20);
        Node third=new Node(30);
        Node fourth=new Node(40);
        obj1.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=null;

        obj1.insertpos(55,3);
        obj1.display();                 // calling of display function
    }
}