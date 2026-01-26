package Linked_List;

public class Basic {

    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(25);
        head.next.next=new Node(65);

        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
}
