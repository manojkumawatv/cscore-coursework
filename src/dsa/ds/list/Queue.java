package dsa.ds.list;

//LinkedList Implementation
public class Queue {
    int val;
    Queue next;
    //LIFO
    Queue head;
    Queue tail;
    public Queue(){
    }
    public void enqueue(int val){
        Queue Node=new Queue();
        Node.val=val;
        if(head==null){
            head=Node;
        } else {
            Node.next=head;
            head=Node;
        }
    }
    public void display(){
        Queue curr=head;
        while(curr!=null){
            System.out.print(curr.val+", ");
            curr=curr.next;
        }
    }
}
