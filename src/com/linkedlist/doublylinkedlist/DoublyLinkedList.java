package com.linkedlist.doublylinkedlist;

public class DoublyLinkedList {
    // First we have head and tail which is pointing to node
    public static Node head;
    public static Node tail;
    // the size of LL
    static public int size;

    // create doubly node = T.C = O(1) and S.C = O(1)
    public static Node createDoublyLinkedList(int nodeData){
        head = new Node();
        Node node = new Node();
        // set node value to new node created
        node.data = nodeData;
        // set node next and prev as null
        node.next = null;
        node.prev = null;
        // set head and tail to node
        head = node;
        tail = node;
        // increment size of to 1
        size = 1;
        return head;
    }

    // inserting node => T.C = O(n) and S.C = O(1)
    // We have three ways to insert node in DLL => At Beg and middle and end.
    public void InsertInLinkedlList(int nodeData,int location){
        // new node is created-address
        Node node = new Node();
        // new node data
        node.data = nodeData;
        // check if node is already created
        // if head is null it means that node is not create so create new node
        if(head == null){
            System.out.println("Creating New Node...");
            createDoublyLinkedList(nodeData);
            return;
        }
        // if node is created and we want to insert node at first or beginning then set location as zero
        else if(location == 0){
            System.out.println("Insert At Beg....");
            node.prev = null;
            node.next = head;
            head.prev = node;
            head = node;
        }
        // if node is created and we want to insert node at last position
        // check condition like location should be greater than current size of node because
        // if location is not >= size it means that you have more nodes than given location
        else if(location >= size){
            System.out.println("Insert At End....");
            node.next = null;
            node.prev = tail;
            tail.next = node;
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
            node.next = tempNode.next;
            node.prev = tempNode;
            tempNode.next.prev = node;
            tempNode.next = node;
        }
        size++;
    }

    // traversing node = T.C = O(n) and S.C = O(1)
    public void traverseDoublyLinkedList(){
        // check if node is created or not
        if(head == null){
            System.out.println("DLL does not exist...");
        }else{
            // start with head
            Node tempNode = head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.data);
                // print LL properly
                if(i != size-1){
                    System.out.print(" <-> ");
                }
                // continue to next node print till size
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    // traversing node = T.C = O(n) and S.C = O(1)
    public void reverseTraverseDoublyLinkedList(){
        // check if node is created or not
        if(head == null){
            System.out.println("DLL does not exist...");
        }else{
            // start with tail
            Node tempNode = tail;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.data);
                // print LL properly
                if(i != size-1){
                    System.out.print(" <-> ");
                }
                // continue to prev node print till size
                tempNode = tempNode.prev;
            }
        }
        System.out.println("\n");
        }

    // Search Node => T.c = O(n) and S.C = O(1)
    public static boolean searchNode(int nodeData){
        // check node is created or not
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
            System.out.println("DLL does not exist");
            return;
        }
        // delete node at begining
        else if(location ==0 ){
            // case 2 : there is only one node as first node
            if(size == 1){
                // point tail and head also as null
                tail = null;
                head = null;
                size--;
            }
            else {
                // case 1 : if you have more than one node and want to delete first node
                head = head.next;
                head.prev = null;
                // size is going decrease by one
                size--;
            }
        }
        // delete node at end
        else if(location >= size){
            // for delete end node you need to traverse so head set to tempnode
            Node tempNode = tail.prev;
            // case 1 : if at end we have only one node then set head & tail and prev and next as null
            if(size == 1){
                tail = head = null;
                size--;
                return;
            }
            else {
                // case 2 : if you have more than one end
                tempNode.next = null;
                tail = tempNode;
                size--;
            }
        }
        // delete node from given location
        else{
            Node tempNode = head;
            for(int i=0;i<location-1;i++){
                // traverse each node
                tempNode = tempNode.next;
            }
            // move both side prev and next also
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    // clear node => T.C = O(1) and S.C = O(1)
    public static void clearNode(){
        // logic is like to put null to every node when traverse so it not have link
        Node tempNode = head;
        for(int i=0;i<size;i++){
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("ALL DLL is deleted..");
    }


}
