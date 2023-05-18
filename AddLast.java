package LinkedList;

public class AddLast {
    public class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addLast(int data){
        //Step 1 create a new Node
        Node newNode  = new Node(data);
        if(head == null){
            head=tail = newNode;
            return;
        }
        //tail.next = newNode
       tail.next= newNode;
        tail = newNode;

    }
    public void print(){
        Node temp = head;
        if(head==null){
            System.out.println("List is empty");
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args []){
        AddLast l1 = new AddLast();
        l1.print();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.print();
    }

}
