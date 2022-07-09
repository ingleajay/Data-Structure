package com.linkedlist.circularlinkedlist;

public class CircularLLMain {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.createCircularLinkedList(10);
        // as it's first node so tail and head points to same data
        System.out.println("Head : " + cll.head.data);
        System.out.println("Tail : " + cll.tail.data);
        System.out.println("Check it's pointing to itself or not : " + cll.tail.next.data + " " + cll.head.next.data);
        System.out.println("Size of SLL : " + cll.size);
        System.out.println(" ");

        // inserting node
        cll.InsertInLinkedlList(6,1);
        cll.InsertInLinkedlList(22,2);
        cll.InsertInLinkedlList(88,3);
        cll.InsertInLinkedlList(12,4);
        cll.InsertInLinkedlList(100,0);
        cll.InsertInLinkedlList(120,6);
        cll.InsertInLinkedlList(99,4);

        // travserd
        cll.traverseCircularLinkedList();

        // search node
        cll.searchNode(12);

        // delete node
        cll.deleteNode(0);
        cll.traverseCircularLinkedList();
        cll.deleteNode(2);
        cll.traverseCircularLinkedList();
        cll.deleteNode(51);
        cll.traverseCircularLinkedList();

        // clear node
        cll.clearNode();
        cll.traverseCircularLinkedList();
    }
}
