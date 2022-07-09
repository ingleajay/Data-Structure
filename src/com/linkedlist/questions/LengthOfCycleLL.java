package com.linkedlist.questions;

import com.linkedlist.singlylinkedlist.Node;

public class LengthOfCycleLL {
    public static int lengthCycle(Node head) {
        Node fast = head;
        Node slow = head;
        int count =0;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length
                Node temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return count;
    }
}
