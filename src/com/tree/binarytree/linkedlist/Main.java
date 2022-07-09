package com.tree.binarytree.linkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTreeLL b = new BinaryTreeLL();
        System.out.println("Enter value of root Node");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        b.root = new BinaryTreeLL.Node(value);
        b.populate(scanner, b.root);
        b.display(b.root," ");
        System.out.println("Pre order : ");
        b.preOrderTraversal(b.root);
        System.out.println("Post order : ");
        b.postOrderTraversal(b.root);
        System.out.println("In order : ");
        b.inOrderTraversal(b.root);
        System.out.println("Level order : ");
        b.LevelOrderTraversal(b.root);

        int search = 5;
        if(b.search(b.root,search)){
            System.out.println( search + " is present in tree..");
        }
        else{
            System.out.println( search + " is not present in tree..");
        }

        b.insertNode(10);
        b.display(b.root," ");

        System.out.println("Get deepest Node : " +  b.getDeepestNode().value);

        b.deleteDeepestNode();
        b.display(b.root," ");
        b.LevelOrderTraversal(b.root);

        b.deleteNode(5);
        b.LevelOrderTraversal(b.root);

        System.out.println("Total No of nodes : " + b.totalNoOfNodes(b.root));
        System.out.println("Height of tree : " + b.heightOfTree(b.root));
        System.out.println("Largest node in tree : " + b.largestOfNode(b.root));

        b.clearTree();
        b.LevelOrderTraversal(b.root);
    }
}
