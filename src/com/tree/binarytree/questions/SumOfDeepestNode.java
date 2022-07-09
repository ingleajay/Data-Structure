package com.tree.binarytree.questions;

import com.tree.binarytree.linkedlist.BinaryTreeLL;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SumOfDeepestNode {

    static Node root;

    public static int deepestLeavesSum(Node root) {

        ArrayList<Integer> arr = new ArrayList<>();
        if(root.left == null && root.right==null)
            arr.add(root.val);
        ArrayList<Integer> deepNodeArr = getAllDeepNode(root,1,arr);
        System.out.println(deepNodeArr);
        int sum = 0;
        for(Integer i : deepNodeArr){
            sum = sum+i;
        }
        return sum;
    }

    public static int heightOfTree(Node node){
        if(node == null)
            return -1;
        return 1+ Math.max(heightOfTree(node.left) , heightOfTree(node.right));
    }

    public static ArrayList<Integer> getAllDeepNode(Node node, int c,ArrayList<Integer> arr){
        int height = heightOfTree(root);
        if(node == null){
            return null;
        }
        else {
               getAllDeepNode(node.left, c + 1,arr);
               getAllDeepNode(node.right, c + 1,arr);
               if(node.left != null) {
                   if (c == height) {
                       arr.add(node.left.val);
                   }
               }
            if(node.right != null) {
                if (c == height) {
                    arr.add(node.right.val);
                }
            }

        }
        System.out.println(arr);
        return arr;
    }

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
    static void display(Node node, String indent) {
        if(node == null){
            return;
        }
        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");

    }

    public static void main(String[] args) {
        root = new Node(2);
        insertNode(1);
        insertNode(3);
        insertNode(5);
        display(root," ");
        System.out.println("Sum of deepest level : "+deepestLeavesSum(root));
    }

    //         1
    //     2         3
    //  4     5    6   7
    //8    9 10

    // level = height + 1
    // 4 = 3+1

    // [1] = 4
    // [ 2 3] = 3
    // [ 4 5 6 7] = 2
    // [ 8 9 ] = 1


}
