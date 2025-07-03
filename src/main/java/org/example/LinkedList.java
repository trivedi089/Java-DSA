package org.example;

import java.util.Scanner;

public class LinkedList {

    public static class Node{
        public int data;
        public Node next;
    }

    public static void main(String[] args) {

        Node head = new Node();
        head.data=2;
        head.next=null;

        Node second = new Node();
        second.data=3;
        second.next=null;

        head.next=second;

        Node third = new Node();
        third.data=4;
        third.next=null;

        head.next.next=third;

        Node fourth = new Node();
        fourth.data=5;
        fourth.next=null;
        head.next.next.next=fourth;

        Node fifth = new Node();
        fifth.data=6;
        fifth.next=null;
        head.next.next.next=fifth;

        //deleting node containing data 4
        Node deleteNode = head;
        while(deleteNode.next.data!=4){
            deleteNode=deleteNode.next;
        }
        deleteNode.next=deleteNode.next.next;


        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

}
