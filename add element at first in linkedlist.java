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
public class add element at first in linkedlist 
{
    public static void main(String[] args)
    {
        LinkedList l=new LinkedList();
        l.addfirst(1);
        l.addfirst(2);
        l.addfirst(3);
        l.display();
    }
}