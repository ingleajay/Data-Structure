package com.linkedlist.questions;

import com.linkedlist.kunal.all.SLL;

public class findMiddleNode {
    public static void middleNode(SLL sll) {
        SLL.Node node = sll.head;
        int length = findListLength(node);
        SLL.Node temp = get(length/2,node);
        System.out.println("Node : " + temp.value);
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
    }

    public  static SLL.Node get(int index,SLL.Node node){
        if (node != null) {
            int i =0;
            while(i!=index){
                i++;
                node = node.next;
            }
        }
        return node;
    }

    public static int findListLength(SLL.Node list){
        int c = 0;
        while(list != null){
            c++;
            list = list.next;
        }
        return c;
    }

    // https://leetcode.com/problems/middle-of-the-linked-list/submissions/
    public SLL.Node middleNode(SLL.Node head) {
        SLL.Node s = head;
        SLL.Node f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
}
