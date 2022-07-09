package com.tree.binarytree.array;

// Types of tree :
// Full binary tree : it should have 0 or 2 children
// Perfect binary tree : it should have 2 chilren to every node except leaf node
// complete binary tree : it should be fillled left as possible and need to be filled all
// balanced binary tree : all distance from leaf to node is same it means it is balanced

//T.C = O(log n) and S.C = O(n)
public class BinaryTreeArr {
    // binary tree means we have atmost 0 or 2 children to every node
    // if you start your index with 0 - means root is at index 0
       // --> left = 2x+1 and right=2x+2  :: x is parent index
    // if you start your index with 1 - means root is at index 1
       // keep first arr[0] is empty
      // --> left = 2x and right=2x+1  :: x is parent index

    // use first approach 1

    static int root = 0;
    static String[] str;
    
    // creating binary tree with array. T.C = O(1) and S.C = O(n)
    BinaryTreeArr(int size){
         str = new String[size+1];
        System.out.println("Binary tree of size -  "+ size + " has been created.");
    }

    // root is with index 0
    public int root(String key) {
        str[0] = key;
        return root;
    }

    public int leftChild(String key,int root)
    {   // : root = refers parent of each node index
        if (str[root] == null) {
            System.out.print("Can't set left child because no parent found !! ");
        }
        else {
            root = (root * 2)+1 ;
            str[root] = key;

            System.out.println(str[root] + " " + root);
        }
        return root;
    }

    public int rightChild(String key,int root)
    {
        if (str[root] == null) {
            System.out.print("Can't set right child because no parent found !! ");
        }
        else {
            root = (root *2)+2;
            str[root] = key;

            System.out.println(str[root] + " " + root);
        }
        return root;
    }

    public void displayTree()
    {   System.out.print(str[0] + " : ");
        for (int i = 1; i < 10; i++) {

            if (str[i] != null)
                System.out.print(str[i] + " ");

        }
    }

    public static void main(String[] args) {
        BinaryTreeArr btarr = new BinaryTreeArr(10);
        int root = btarr.root("Drinks");

        int hot = btarr.leftChild("Hot",root);
        int cold = btarr.rightChild("Cold",root);

        btarr.leftChild("Tea",hot);
        btarr.rightChild("Coffee",hot);
        btarr.leftChild("Wine",cold);
        btarr.rightChild("Bear",cold);

        btarr.displayTree();
    }

    // -------------------Drinks ----------- i=0
    // -----hot - i=1 ------- ------------------cold - i=2
    // --tea - i=3 | --coffee - i=4       --wine = i=5 | --bear = i = 6
}
