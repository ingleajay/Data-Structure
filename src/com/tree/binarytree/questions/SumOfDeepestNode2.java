package com.tree.binarytree.questions;

class SumOfDeepestNode2 {
    int sum=0, deepestLevel=0;
    public void deepSum(Node root, int level) {
        if(root==null)
            return;
        if(root.left==null && root.right==null) {
            if(level>deepestLevel) {
                deepestLevel = level;
                sum = root.val;
            }
            else if(deepestLevel==level) {
                sum+=root.val;
            }
            return;
        }
        deepSum(root.left,level+1);
        deepSum(root.right,level+1);
    }
    public int deepestLeavesSum(Node root) {
        deepSum(root,0);
        return sum;
    }
}