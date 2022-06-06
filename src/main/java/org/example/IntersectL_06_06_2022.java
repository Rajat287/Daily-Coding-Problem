package org.example;
//Given two singly linked lists that intersect at some point, find the intersecting node.
//The lists are non-cyclical. For example, given A = 3->7-8->10 and B = 99->1->8->10, return
//the node with value 8.
public class IntersectL_06_06_2022 {
    Node head;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    void push(int value){
        Node newNode = new Node(value);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
    }
    void display(){
        Node itr = head;
        while(itr!=null){
            System.out.print(itr.data+" ");
            itr = itr.next;
        }
        System.out.println();
    }
    int length(){
        int count=0;
        Node itr = head;
        while(itr!=null){
            count++;
            itr = itr.next;
        }
        return count;
    }
    void intersection(Node head1, Node head2,int count1,int count2){
        Node itr1 = head1;
        Node itr2 = head2;
        for (int i=0;i<count1;i++){
            while(itr2!=null){
                if(itr1.data==itr2.data){
                    System.out.println(itr2.data);
                }
                itr2 = itr2.next;
            }
//            System.out.println(itr1.data);
            itr1 = itr1.next;
        }
    }

    public static void main(String[] args) {
        IntersectL_06_06_2022 List1 = new IntersectL_06_06_2022();
        IntersectL_06_06_2022 List2 = new IntersectL_06_06_2022();
        List1.push(10);
        List1.push(8);
        List1.push(7);
        List1.push(3);
        List2.push(10);
        List2.push(8);
        List2.push(1);
        List2.push(99);
        List1.display();
        List2.display();
        List1.intersection(List1.head,List2.head,List1.length(), List2.length());
    }
}
