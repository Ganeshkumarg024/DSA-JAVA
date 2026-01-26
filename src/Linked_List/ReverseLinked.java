package Linked_List;

import java.util.LinkedList;

public class ReverseLinked {
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        LinkedList<Integer>ll=new LinkedList<>();
        ll.add(34);

        Node temp1=head;
        while (temp1!=null){
            System.out.print(temp1.data+"->");
            temp1=temp1.next;
        }
        System.out.print("null");

        Node prev=null;
        Node curr=head;
        while (curr!=null){
            Node currtemp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=currtemp;
        }
        System.out.println();
        Node temp=prev;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }

    }
}
