package com.tree.binarytree.array;

public class TreeMain {

    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        drinks.addChild(hot);
        drinks.addChild(cold);
        // ----------- drinks --------
        //----Hot-------------Cold-----

        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        hot.addChild(tea);
        hot.addChild(coffee);
        // ----------- drinks --------
        //----Hot-------------Cold-----
        //-tea---coffee-----------------

        TreeNode wine = new TreeNode("Wine");
        TreeNode bear = new TreeNode("Bear");
        TreeNode redbool = new TreeNode("RedBool");
        cold.addChild(wine);
        cold.addChild(bear);
        wine.addChild(redbool);
        // ----------- drinks --------
        //----Hot-------------Cold-----
        //-tea---coffee----wine----bear-

        System.out.println(drinks);
        System.out.println(drinks.printChildren(0));
    }


}
