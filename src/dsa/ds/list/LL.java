package dsa.ds.list;

class Node {
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class LL {
    private Node head;

    public LL() {
        head=null;
    }
    public void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.val+" ");
            curr=curr.next;
        }
    }
    public int get(int index) {
        int i = 0;
        Node curr = head;
        while (curr != null) {
            if (i == index) {
                return curr.val;
            }
            i++;
            curr = curr.next;
        }
        return -1;
    }

    public void addAtHead(int val) {
        Node tmp = new Node(val);
        if (head == null) {
            head = tmp;
        } else {
            tmp.next = head;
            head = tmp;
        }
    }

    public void addAtTail(int val) {
        Node tmp = new Node(val);
        if(head==null) {
            head=tmp;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        // now curr is tail
        curr.next = tmp;
    }

    public void addAtIndex(int index, int val) {
        Node curr = head;
        int i = 0;
        if(index<0) return;
        
        Node tmp = new Node(val);
        if (index == 0) {
            tmp.next=head;
            head=tmp;
            return;
        }
        while (curr != null && i < index - 1) {
            i++;
            curr = curr.next;
        } // node at i-1 th index
        if (curr == null) return; //IndexOutOfBounds
        tmp.next = curr.next;
        curr.next = tmp;
    }

    public void deleteAtIndex(int index) {
        if(index<0 || head==null) return;
        if(index==0){
            head=head.next;
            return;
        }

        Node curr=head;
        int i=0;
       
        while(curr!=null && i<index-1){
            i++;
            curr=curr.next;
        }
        if(curr==null || curr.next==null) return; //IndexOutOfBounds as NPE 
        curr.next=curr.next.next;
    }
}