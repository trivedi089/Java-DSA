package org.example;

public class BinaryTree {

     static class Node{
        Node lChild;
        Node rChild;
        int data;
    }
    public static void main(String[] args){

        Node root=new Node();
        root.data=30;
        root.lChild=null;
        root.rChild=null;

        Node newNode1=new Node();
        newNode1.data=15;
        newNode1.lChild=null;
        newNode1.rChild=null;

        Node newNode2=new Node();
        newNode2.data=50;
        newNode2.lChild=null;
        newNode2.rChild=null;

        root.lChild=newNode1;
        root.rChild=newNode2;

        Node newNode3=new Node();
        newNode3.data=10;
        newNode3.lChild=null;
        newNode3.rChild=null;

        Node newNode4=new Node();
        newNode4.data=20;
        newNode4.lChild=null;
        newNode4.rChild=null;

        root.lChild.lChild=newNode3;
        root.lChild.rChild=newNode4;

        Node newNode5=new Node();
        newNode5.data=40;
        newNode5.lChild=null;
        newNode5.rChild=null;

        Node newNode6=new Node();
        newNode6.data=60;
        newNode6.lChild=null;
        newNode6.rChild=null;

        root.rChild.lChild=newNode5;
        root.rChild.rChild=newNode6;

        System.out.print("Preorder Traversal : ");
        preorderTraversal(root);
        System.out.print("inorder Traversal : ");
        inorderTraversal(root);  //Inorder traversal of binary search tree gives sorte order
        System.out.print("postorder Traversal : ");
        postorderTraversal(root);
    }

    static void preorderTraversal(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorderTraversal(root.lChild);
            preorderTraversal(root.rChild);
        }
    }
    static void inorderTraversal(Node root){
        if(root!=null){
            inorderTraversal(root.lChild);
            System.out.print(root.data+" ");
            inorderTraversal(root.rChild);
        }
    }
    static void postorderTraversal(Node root){
        if(root!=null){
            postorderTraversal(root.lChild);
            postorderTraversal(root.rChild);
            System.out.print(root.data+" ");
        }
    }
}
