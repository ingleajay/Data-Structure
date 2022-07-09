package com.tree.binarytree.array;

import java.util.ArrayList;

// creating tree Node
public class TreeNode {

    public String data;
    public ArrayList<TreeNode> children;

    public TreeNode(String data) {
        this.data = data;
        this.children = new ArrayList<TreeNode>();
    }

    // Add child for node
    public void addChild(TreeNode node){
        this.children.add(node);
    }

     // show each children of node on every level
    public String printChildren(int level){
        String child;
        child = " ".repeat(level)+data+"\n";
        for(TreeNode node : this.children){
            child = child + node.printChildren(level+1);
        }
        return child;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data='" + data + '\'' +
                ", children=" + children +
                '}';
    }
}
