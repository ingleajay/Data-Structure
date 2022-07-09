package com.linkedlist.questions;

import com.linkedlist.singlylinkedlist.SinglyLinkedList;

public class RemoveDuplicateFromSortedLL {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.InsertInLinkedlList(6,1);
        sll.InsertInLinkedlList(22,2);
        sll.InsertInLinkedlList(22,3);
        sll.InsertInLinkedlList(12,4);
        sll.InsertInLinkedlList(6,0);
        sll.InsertInLinkedlList(32,3);
        sll.traverseSinglyLinkedList();
        sll.deleteDuplicates();
        sll.traverseSinglyLinkedList();
    }
}
