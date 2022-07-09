package com.linkedlist.circulardoublylinkedlist;

public class CircularDLLMain {

    public static void main(String[] args) {

        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createDoublyCircularLinkedList(10);
        // as it's first node so tail and head points to same data
        System.out.println("Head : " + cdll.head.data);
        System.out.println("Tail : " + cdll.tail.data);
        System.out.println("Check it's pointing to itself or not : " + cdll.tail.next.data + " " + cdll.head.next.data);
        System.out.println(cdll.head.prev.data + " " + cdll.tail.prev.data);
        System.out.println("Size of SLL : " + cdll.size);
        System.out.println(" ");

        // inserting node
        cdll.InsertInLinkedlList(6,1);
        cdll.InsertInLinkedlList(22,2);
        cdll.InsertInLinkedlList(88,3);
        cdll.InsertInLinkedlList(12,4);
        cdll.InsertInLinkedlList(100,0);
        cdll.InsertInLinkedlList(120,6);
        cdll.InsertInLinkedlList(99,4);

        cdll.traverseCircularDoublyLinkedList();

        // search node
        cdll.searchNode(12);

        // reverse
        cdll.reverseTraverseCDLL();

        // delete node
        cdll.deleteNode(0);
        cdll.traverseCircularDoublyLinkedList();
        cdll.deleteNode(2);
        cdll.traverseCircularDoublyLinkedList();
        cdll.deleteNode(51);
        cdll.traverseCircularDoublyLinkedList();

        // clear
        cdll.clearNode();
        cdll.traverseCircularDoublyLinkedList();
    }


}
