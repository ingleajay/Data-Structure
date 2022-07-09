package com.linkedlist.singlylinkedlist;

public class SinglyLLMain {
    public static void main(String[] args) {

        // create object of SLL
        SinglyLinkedList sll = new SinglyLinkedList();

        // create first node
        sll.createSinglyLinkedList(10);

        // as it's first node so tail and head points to same data
        System.out.println("Head : " + sll.head.data + " And Addr : " + sll.head.hashCode());
        System.out.println("Tail : " + sll.tail.data + " And Addr : " + sll.tail.hashCode());
        System.out.println("Size of SLL : " + sll.size);
        System.out.println(" ");

        // inserting node
        sll.InsertInLinkedlList(6,1);
        sll.InsertInLinkedlList(22,2);
        sll.InsertInLinkedlList(88,3);
        sll.InsertInLinkedlList(12,4);
        sll.InsertInLinkedlList(100,0);
        sll.InsertInLinkedlList(32,3);
        sll.InsertInLinkedlList(99,5);

        // Traversing node..
        sll.traverseSinglyLinkedList();


        // search node data
        sll.searchNode(32);

        // delete node
        sll.deleteNode(1);
        sll.traverseSinglyLinkedList();
        sll.deleteNode(0);
        sll.traverseSinglyLinkedList();
        sll.deleteNode(51);
        sll.traverseSinglyLinkedList();

        // clear node
        sll.clearNode();
        sll.traverseSinglyLinkedList();


    }
}
