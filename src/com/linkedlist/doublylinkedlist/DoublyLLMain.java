package com.linkedlist.doublylinkedlist;

public class DoublyLLMain {
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDoublyLinkedList(10);
        System.out.println("Head : " + dll.head.data);
        System.out.println("Tail : " + dll.tail.data);
        System.out.println("check prev and next points null : " + dll.head.prev + " " + dll.head.next);
        System.out.println("Size of SLL : " + dll.size);
        System.out.println(" ");

        // insert node
        dll.InsertInLinkedlList(6,1);
        dll.InsertInLinkedlList(22,2);
        dll.InsertInLinkedlList(88,3);
        dll.InsertInLinkedlList(12,4);
        dll.InsertInLinkedlList(100,0);
        dll.InsertInLinkedlList(120,4);
        dll.InsertInLinkedlList(180,7);

        // travserd
        dll.traverseDoublyLinkedList();

        // reverse travsers
        dll.reverseTraverseDoublyLinkedList();

        // searchnode
        dll.searchNode(88);

        // delete
        dll.deleteNode(0);
        dll.traverseDoublyLinkedList();
        dll.deleteNode(3);
        dll.traverseDoublyLinkedList();
        dll.deleteNode(52);
        dll.traverseDoublyLinkedList();

        // clear node
        dll.clearNode();
        dll.traverseDoublyLinkedList();

    }
}
