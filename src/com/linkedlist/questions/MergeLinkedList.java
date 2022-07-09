package com.linkedlist.questions;

import com.linkedlist.singlylinkedlist.Node;
import com.linkedlist.singlylinkedlist.SinglyLinkedList;

public class MergeLinkedList {
    public static void main(String[] args) {
        // first list1
        SinglyLinkedList sll1 = new SinglyLinkedList();
        sll1.InsertInLinkedlList(1,0);
        sll1.InsertInLinkedlList(8,1);
        sll1.InsertInLinkedlList(9,2);
        sll1.InsertInLinkedlList(3,3);
        sll1.traverseSinglyLinkedList();
        //second list2
        SinglyLinkedList sll2 = new SinglyLinkedList();
        sll2.InsertInLinkedlList(1,0);
        sll2.InsertInLinkedlList(2,1);
        sll2.InsertInLinkedlList(2,2);
        sll2.InsertInLinkedlList(3,3);
        sll2.traverseSinglyLinkedList();

    }

}
