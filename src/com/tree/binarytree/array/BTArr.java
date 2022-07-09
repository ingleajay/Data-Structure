package com.tree.binarytree.array;

public class BTArr {
    static String[] str;
    int lastUsedIndex = 0;

    // creating array : T.C = O(1) and S.C = O(n)
    BTArr(int size){
        str = new String[size+1];
        System.out.println("Binary tree of size -  "+ size + " has been created.");
    }

    public boolean isFull(){
        return str.length-1 == lastUsedIndex ? true : false;
    }

    // inserted array : T.C = O(1) and S.C = O(1)
    public void insertNode(String value) {
        if(str != null) {
            if (isFull()) {
                System.out.println("Binary tree is full..");
            } else {
                str[lastUsedIndex + 1] = value;
                lastUsedIndex++;
                System.out.println(value + " is inserted");
            }
        }
        else{
            System.out.println("Tree is empty");
        }
    }

    // preorder traversal = root - left - right = T.C = O(n) and S.C = O(n)
    public void preOrder(int index){
        if(str != null) {
            if (index > lastUsedIndex) {
                return;
            }
            System.out.print(str[index] + " ");
            preOrder(index * 2);
            preOrder((index * 2) + 1);
        }
        else{
            System.out.println("Tree is empty");
        }
    }

    // postorder traversal = left right root =T.C = O(n) and S.C = O(n)
    public void postOrder(int index){
        if(str != null) {
            if (index > lastUsedIndex) {
                return;
            }
            postOrder(index * 2);
            postOrder((index * 2) + 1);
            System.out.print(str[index] + " ");
        }
        else{
            System.out.println("Tree is empty");
        }
    }

    // inorder traversal = left root right= T.C = O(n) and S.C = O(n)
    public void inOrder(int index){
        if(str != null) {
            if (index > lastUsedIndex) {
                return;
            }
            inOrder(index * 2);
            System.out.print(str[index] + " ");
            inOrder((index * 2) + 1);
        }
        else{
            System.out.println("Tree is empty");
        }
    }

    // levelorder traversal T.C = O(n) and S.C = O(1)
    public void levelOrder(int index){
        if(str != null) {
            if (index > lastUsedIndex) {
                return;
            }
            for (int i = 1; i <= lastUsedIndex; i++) {
                System.out.print(str[i] + " ");
            }
        }
        else{
            System.out.println("Tree is empty");
        }
    }

    // T.C = O(n) and S.C = O(1)
    public int search(String searchVal){

        for(int i=1;i<=lastUsedIndex;i++){
            if(searchVal.equals(str[i])){
                System.out.println("Search value : " + searchVal + " is found");
                return i;
            }
        }
        System.out.println("Search value : " + searchVal + " is not found");
        return -1;
    }

    // T.C = O(n) and S.C = O(1)
    public void deleteNode(String value){
        int getdeepestNodeIndex = search(value);
        if(getdeepestNodeIndex==-1){
            System.out.println("You can't delete because it is not present in tree");
        }
        if(getdeepestNodeIndex != -1){
                str[getdeepestNodeIndex] = str[lastUsedIndex];
                deleteDeepestNode();
        }
    }

    public void deleteDeepestNode(){
        str[lastUsedIndex] = null;
        lastUsedIndex--;
    }

    // T.C = O(1) and S.C = O(1)
    public void clearTree(){
        str = null;
        System.out.println("Tree is cleared..");
    }

    public int heightOfTree(int index){
        if(index > lastUsedIndex){
            return -1;
        }
        return 1 + Math.max(heightOfTree((index*2)),heightOfTree((index*2)+1));
    }


    public static void main(String[] args) {
        BTArr tree = new BTArr(10);
        tree.insertNode("Drinks");
        tree.insertNode("Hot");
        tree.insertNode("Cold");
        tree.insertNode("Tea");
        tree.insertNode("Coffee");
        tree.insertNode("Wine");
        tree.insertNode("Bear");

        System.out.println("height of tree : " + tree.heightOfTree(1));

        System.out.println("PreOrder : ");
        tree.preOrder(1);

        System.out.println(" ");
        System.out.println("PostOrder : ");
        tree.postOrder(1);

        System.out.println(" ");
        System.out.println("InOrder : ");
        tree.inOrder(1);

        System.out.println(" ");
        System.out.println("LevelOrder : ");
        tree.levelOrder(1);

        System.out.println(" ");
        tree.search("Wine");

        tree.deleteNode("hhfh");
        tree.levelOrder(1);

        System.out.println(" ");
        tree.clearTree();
        tree.levelOrder(1);
    }
}
