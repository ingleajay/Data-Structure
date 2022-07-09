package com.linkedlist.questions;

import com.linkedlist.singlylinkedlist.Node;

public class detectNodeWhereCycleStart {
    // https://leetcode.com/problems/linked-list-cycle-ii/
    public Node detectCycle(Node head) {
        int length = 0;

       Node fast = head;
       Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = LengthOfCycleLL.lengthCycle(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        // find the start node
        Node f = head;
        Node s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }

        // keep moving both forward and they will meet at cycle start
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    // we will find node where fast and slow meet first time
    // calculate length of node till they meet
    // we have decremnt length by 1 till clow reaches to node where cycle start
    // and keep move fast as well
    // if both will move and point to same node then that is point where cycle is start.
}
