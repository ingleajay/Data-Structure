package com.tree.binarytree.linkedlist;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeLL {
    static Node root;
    static class Node{
        int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    // T.C = O(n/2)+O(n/2) = O(n) and S.C = O(n)
    // preorder traversal => root -> left -> right
    static void preOrderTraversal(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.value + " " );
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
    // output => 1 2 4 5 3 6 7


    // T.C = O(n/2)+O(n/2) = O(n) and S.C = O(n)
    // inorder traversal => left -> root -> right
    static void inOrderTraversal(Node node){
        if(node == null){
            return;
        }
        inOrderTraversal(node.left);
        System.out.println(node.value + " " );
        inOrderTraversal(node.right);
    }
    //output : 4 2 5 1 6 3 7


    // T.C = O(n/2)+O(n/2) = O(n) and S.C = O(n)
    // postorder traversal => left -> right -> root
    static void postOrderTraversal(Node node){
        if(node == null){
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.value + " " );
    }
    // output : 4 5 2 6 7 3 1


    // T.C = O(n) and S.C = O(n)
    // level traversal = level wise print
    static void LevelOrderTraversal(Node node) {
        Queue<Node> queue = new LinkedList<>();
        if(root != null)
            queue.add(root);
        else
            System.out.println("Can not print level order traversal");
        while (!queue.isEmpty()){
            Node presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
        System.out.println(" ");
    }

    //  T.C = O(n) and S.C = O(n)
    static boolean search(Node node, int value) {
        // approch 1:
//        if(node == null){
//            return false;
//        }
//        if(node.value == value){
//            return true;
//        }
//        return search(node.left, value) || search(node.right, value);

        // approach 2 :
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node presentNode = queue.remove();
            if(presentNode.value == value) {
                return true;
            }
            else {
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
        }
        return false;
    }

    static void display(Node node, String indent) {
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");

    }

    static void populate(Scanner scanner, Node node) {
        System.out.println("Want to enter left of " + node.value);
        String left = scanner.next();
        if (left.equals("y")) {
            System.out.println("Enter value of left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Want to enter right of " + node.value);
        String right = scanner.next();
        if (right.equals("y")) {
            System.out.println("Enter value of right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }

    }

    //   T.C = O(n) and S.C = O(n)
    static void insertNode(int value){
         Node node  = new Node(value);
         Queue<Node> queue = new LinkedList<>();
         if(root == null){
             root = node;
             System.out.println("Inserted new value at root..");
         }
        queue.add(root);
        while (!queue.isEmpty()) {
            Node presentNode = queue.remove();
            if(presentNode.left == null){
                presentNode.left = node;
                System.out.println("Inserted new value at left of tree ");
                break;
            }
            else if(presentNode.right == null){
                presentNode.right = node;
                System.out.println("Inserted new value at right of tree ");
                break;
            }else{
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

    // delete deepest node
    static void deleteDeepestNode(){

        //          1
        //    2          3
        // 4    null    6   null


        Queue<Node> queue = new LinkedList<>();
        queue.add(root);     // [ 1 ]
        Node latestNode = null;
        Node parentNode = null;
        while (!queue.isEmpty()){
            Node temp = queue.remove();  // temp = 1, 2 , 3, 4 , 6
            if(temp.left != null){
                queue.add(temp.left);   // q = [2] , [ 3, 4 ] , [ 4, 6 ]
                if (temp.left.left == null && temp.left.right == null) {
                    latestNode  = temp.left; // 4 , 6
                    parentNode = temp;  // 2 , 3
                }
            }
            if(temp.right != null){
                queue.add(temp.right); // q = [ 2, 3 ]
                if (temp.right.left == null && temp.right.right == null) {
                    latestNode  = temp.right;
                    parentNode = temp;
                }
            }
        }
        if (latestNode  != null && parentNode != null) { // 3 to left set to be null
            if (parentNode.right != null)
                parentNode.right = null;
            else
                parentNode.left = null;
        }
        else
            System.out.println("Empty Tree");
    }


    // find deepest node
    static  Node getDeepestNode(){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node presentNode = null;
        while (!queue.isEmpty()){
            presentNode = queue.remove();
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
         return presentNode;
    }

    // T.C = O(n) and S.C = O(n)
    // delete node
    // step 1 : get deepest value from tree
    // step 2 : store deepest value with deleted value
    // step 3 : delete deepest value
    static void deleteNode(int value){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node presentNode = queue.remove();
            if(presentNode.value == value){
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println(value + " node is deleted..");
                return;
            }
            else{
                if(presentNode.left != null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right != null){
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println(value + " is not present in tree..");
    }

    // T.C = O(1) and S.C = O(1)
    // clear tree
    static void clearTree(){
        root = null;
        System.out.println("Tree is cleard...");
    }

    // find total no of nodes
    static int totalNoOfNodes(Node node) {

        //      1
        //   2    3
        // 4     5   6
        //  node => 1
        // 1 +s(2)+s(3)
        // 1+ [ 1 + s(4)] + [ 1 + s(5) + s(6) ]
        // 1 + [ 1 + 1 + 0 + 0 ] + [ 1 + 1 + 0 + 0 + 1 + 0 + 0 ]
        //  ans  = 6

        if(node == null){
            return 0;
        }
        return 1 + totalNoOfNodes(node.left) + totalNoOfNodes(node.right);
    }

    static int heightOfTree(Node node){
        //      1
        //   2    3
        // 4     5   6
        // node = 1
        // 1  + max ( h(2),h(3))
        // 1 + max ( (1 + max( h(4) , -1 ) , (1 + max( h(5) , h(6) )  )
        // 1 + max ( ( 1 + max ( (1 + max ( -1,-1 )) , -1 ) , (1 + max( (1 + max(-1,-1)), (1 + max(-1,-1)))))
        // 1 + max ( (1+0) , (1+0))
        // 1  +max(1,1) => 1+ 1 => 2

        if(node == null){
            return -1;
        }
        return 1 + Math.max(heightOfTree(node.left),heightOfTree(node.right));
    }

    static  int largestOfNode(Node node) {

        int max = node.value;

        if(node.left != null){
            max = Math.max(max, largestOfNode(node.left));
        }
        if(node.right != null){
            max = Math.max(max, largestOfNode(node.right));
        }
        return max;
    }
}

//        1
//   2       3
// 4   5   6    7