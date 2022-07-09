package com.linkedlist.questions;

import com.linkedlist.singlylinkedlist.Node;

public class InsertRecInSLL {
    public static InsertRecInSLL.Node Node;

    static class Node{
        int data;
        Node next;
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    Node head;
    int size = 0;

    public void insertRec(int data, int index)
    {
        // pass head as first node
        // index as given index
        head = insertRec(data,index,head);
    }

    private Node insertRec(int data,int index,Node node){
        //insert at beg
        if(index == 0){
            // tempnode is first node which is created
            Node tempNode = new Node(data,node);
            // increses size of node
            size++;
            return tempNode;
        }
        // insert at middle
        // we decrease index by one and place that next pointer to node
        node.next =  insertRec(data,index-1,node.next);
        return node;
    }

    public void traverseSLL(){
        // check if node is created or not
        if(head == null){
            System.out.println("SLL does not exist...");
        }else{
            // start with head
            Node tempNode = head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.data);
                // print LL properly
                if(i != size-1){
                    System.out.print(" -> ");
                }
                // continue to next node print till size
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }


    // data-  2 -> 4 -> 5 -> 8 -> 9 -> null
   //index-   0    1    2    3    4

    // index = 2 and data = 10
    // head = 2 addr
    // in(10,1,2 addr) , size=5
    // in(10,0,4 addr), size=5
    // tempnode = 10 and 4 addr, size=6
    // insert 10 link to 4 addr

    //  2 -> 4 -> 10 -> 5 -> 8 -> 9 -> null
}
class InsertRecInSLLMain{
    public static void main(String[] args) {

        InsertRecInSLL in = new InsertRecInSLL();
        in.insertRec(2,0);
        in.insertRec(4,1);
        in.insertRec(5,2);
        in.insertRec(8,3);
        in.insertRec(9,4);
        in.traverseSLL();

        in.insertRec(10,2);
        in.traverseSLL();

    }
}
