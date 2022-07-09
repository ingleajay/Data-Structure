package com.linkedlist.questions;

import com.linkedlist.singlylinkedlist.Node;

public class FindCycle {
    // https://leetcode.com/problems/linked-list-cycle/
    // use slow and fast method
    public boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
