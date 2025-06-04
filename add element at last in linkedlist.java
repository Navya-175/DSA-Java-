class Node 
{
    int data; 
    Node next; 
    Node(int n) 
    {
        this.data=n;
        this.next=null;
    }
}
class LinkedList 
{
    Node head=null;
    void addlast(int n)
    {
        Node newnode=new Node(n);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node current=head;
        
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newnode;
    }
  }

void display()
{
    Node current=head;
    while(current!=null)
    {
        System.out.println(current.data);
        current=current.next;
    }
 } 
}
public class add element at last in linkedlist
{
    public static void main(String[] args)
    {
        LinkedList l=new LinkedList();
        l.addlast(1);
        l.addlast(2);
        l.addlast(3);
        l.display();
    }
}
	