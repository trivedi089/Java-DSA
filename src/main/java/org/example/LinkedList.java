package org.example;

import java.util.Scanner;

public class LinkedList {

    public class Node{}{
        int data;
        Node next;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        System.out.println("Choose wha you want to do : /n" +
                "1. Insertion" +
                "2. Deletion" +
                "3. Merge in between");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("How many elements do you want to insert : ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int element = sc.nextInt();
                insertElement(list, element)
            }
        }

    }

    static void insertElement(LinkedList list, int element){
        Node newNode = new Node(element,null);
        list->Node=newNode;
    }

}
