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
    void addfirst(int n)
    {
        Node newnode=new Node(n); 
        newnode.next=head;
        this.head=newnode;
    }
    void dellast()
    {
        Node current=head;
        while(current.next.next!=null)
        {
            current=current.next;
        }
        current.next=null;
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
public class del element at last
{
    public static void main(String[] args)
    {
        LinkedList l=new LinkedList();
        l.addfirst(1);
        l.addfirst(2);
        l.dellast();
        l.display();
    }
}