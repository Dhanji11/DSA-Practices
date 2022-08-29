  //Program for singly lisnked list
  public class SinglyLL_1{
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
        SinglyLL_1 obj1=new SinglyLL_1();
        obj1.head=new Node(10);
        Node second=new Node(20);
        Node third=new Node(30);
        Node fourth=new Node(40);
        obj1.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=null;

        obj1.display();                 // calling of display function
    }
}