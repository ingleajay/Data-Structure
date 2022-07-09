package com.linkedlist.kunal.all;

import com.linkedlist.questions.findMiddleNode;

public class Main {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(100, 3);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.delete(2);
        list.display();
        System.out.println("Found the node at the location : " + list.find(2) + "\n");

        // merge on two sorted list
        SLL node1 = new SLL();
        SLL node2 = new SLL();
        node1.insertLast(10);
        node1.insertLast(33);
        node1.insertLast(88);
        node1.insertLast(99);
        node1.insertLast(100);
        node1.display();

        // middle ele found
        System.out.println("Middle Ele : ");
        findMiddleNode.middleNode(node1);

        node2.insertLast(10);
        node2.insertLast(20);
        node2.insertLast(33);
        node2.display();
        SLL merge = SLL.mergeLinkedList(node1,node2);
        System.out.println("Merge list : ");
        merge.display();

        DLL d = new DLL();
        d.insertFirst(1);
        d.insertFirst(2);
        d.insertFirst(4);
        d.insertFirst(5);
        d.insert(8, 65);
        d.display();

        CLL c = new CLL();
        c.insert(23);
        c.insert(3);
        c.insert(19);
        c.insert(75);
        c.display();
    }
}
