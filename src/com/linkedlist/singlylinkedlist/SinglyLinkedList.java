package com.linkedlist.singlylinkedlist;

import com.linkedlist.questions.InsertRecInSLL;

public class SinglyLinkedList {
    // First we have head and tail which is pointing to node
    public static Node head;
    public static Node tail;
    // the size of LL
    static public int size;

    // creating first node in SLL => T.C = O(1) and S.C = O(1)
    public static Node createSinglyLinkedList(int nodeData){
        // Head Node is created it has some address ex.101
        head = new Node();
        // create new Node it has some address ex.001
        Node node = new Node();
        // it's first node so your next pointer is null
        node.next = null;
        // store your data to Node
        node.data = nodeData;
        // point your head and tail as it has only one node 001 addr
        head = node;
        tail = node;
        // maintain size
        size = 1;
        // return your head latest node
        return head;
    }

    // inserting node => T.C = O(n) and S.C = O(1)
    // We have three ways to insert node in SLL => At Beg and middle and end.
    public void InsertInLinkedlList(int nodeData,int location){
        // new node is created-address
        Node node = new Node();
        // new node data
        node.data = nodeData;
        // check if node is already created
        // if head is null it means that node is not create so create new node
        if(head == null){
            System.out.println("Creating New Node...");
            createSinglyLinkedList(nodeData);
            return;
        }
        // if node is created and we want to insert node at first or beginning then set location as zero
        else if(location == 0){
            System.out.println("Insert At Beg....");
            // we need to remove previous link of head to old node
            // set head next addr to new node addr
            node.next = head;
            // set new node to head so make relation with head
            head = node;
        }
        // if node is created and we want to insert node at last position
        // check condition like location should be greater than current size of node because
        // if location is not >= size it means that you have more nodes than given location
        else if(location >= size){
            System.out.println("Insert At End....");
            // set null to new node because at end it points always null addr
            node.next = null;
            // set new node addr to last node so we can make relation with it
            // last node will be tail
            tail.next = node;
            // point node to tail so it become last node
            tail = node;
        }
        // if node is created and we want to insert node at specified position
        else{
            System.out.println("Insert At Middle....");
            // we need to traverse LL so we will start with head first
            Node tempNode=head;
            // start with index 0
            int index =0;
            // reach to that given location with indexes
            while (index < location-1){
                // traverse each node till find location node
                tempNode = tempNode.next;
                index++;
            }
            // After you reached to location
            // take temp node addr as next node for replacing with new node next addr
            Node nextNode = tempNode.next; // ex. nextNode,tempNode = 333 , node = 444
            // put node addr to exisitng node
            tempNode.next = node; // tempNode = 444
            // make new relation between new node and old node
            node.next = nextNode; // node = 333
        }
        size++;
    }

    // traversing node = T.C = O(n) and S.C = O(1)
    public void traverseSinglyLinkedList(){
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

    // Search Node => T.c = O(n) and S.C = O(1)
    public static boolean searchNode(int nodeData){
        // check node is creted or not
        if(head != null){
            // set first node as head node
            Node tempNode = head;
            for(int i=0;i<size;i++){
                // check your first node with search node and inc later
                if(tempNode.data == nodeData){
                    System.out.println("Found the node at the location : " + i + "\n");
                    return true;
                }
                // inc to next node
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found..");
        return false;
    }

    // delete node => T.c = O(n) and S.C = O(1)
    public  static  void deleteNode(int location){
        // there is no node created
        if(head == null){
            System.out.println("SLL does not exist");
            return;
        }
        // delete node at begining
        else if(location ==0 ){
            // case 1 : if you have more than one node and want to delete first node
            // head points to next node so previous node will be removed
            head = head.next;
            // size is going decrease by one
            size--;
            // case 2 : there is no only one node as first node
            if(size == 0){
                tail = null;
            }
        }
        // delete node at end
        else if(location >= size){
            // for delete end node you need to traverse so head set to tempnode
            Node tempNode = head;
            for(int i=0;i<size-1;i++){
                // traverse each node
                tempNode = tempNode.next;
            }
            // case 1 : if at end we have only one node then set head & tail as null
            if(tempNode == head){
                tail = head = null;
                size--;
                return;
            }
            // case 2 : if you have more than one end
            // second last node addr should be null
            tempNode.next = null;
            // tail points current node
            tail = tempNode;
            size--;
        }
        // delete node from given location
        else{
            Node tempNode = head;
            for(int i=0;i<location-1;i++){
                // traverse each node
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    // clear node => T.C = O(1) and S.C = O(1)
    public static void clearNode(){
        head = null;
        tail = null;
        System.out.println("All Nodes has deleted..");
    }

    public Node deleteDuplicates() {
        Node node = head;
        if(node == null ){
            return node;
        }
        Node head = node;
        while(node.next!= null){
            if(node.data == node.next.data){
                node.next = node.next.next;
                size--;
            }
            else{
                node = node.next;
            }
        }
        tail = node;
        tail.next =null;
        return head;
    }


}


