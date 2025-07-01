package org.example;

import java.util.Collections;
import java.util.Scanner;

public class SortingTechniques {
    public static void main(String[] args) {

        System.out.println("Welcome to Liner Searching Algorithm :)");
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("Please enter the elements in the array");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        bubbleSort(nums,n);
        insertionSort(nums,n);
        selectionSort(nums,n);
        quickSort(nums,0,n-1);
        mergeSort(nums,n);

        System.out.print("nums elements after sorting are ");
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }

    }

    static void bubbleSort(int nums[], int n){

//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-i-1;j++){
//                if(nums[j]>nums[j+1]) {
//                    int temp = nums[j];
//                    nums[j] = nums[j+1];
//                    nums[j+1] = temp;
//                }
//            }
//        }
    }

    static void insertionSort(int nums[], int n){

//        for(int i=1;i<n;i++){
//            int key=nums[i];
//            int j=i-1;
//            while(j>0&&nums[j]>key){
//                nums[j+1]=nums[j];
//                j--;
//            }
//            nums[j+1]=key;
//        }
    }
    static void selectionSort(int nums[], int n){
//        for(int i=0;i<n;i++){
//            int k=i;
//            for(int j=i+1;j<n;j++){
//                if (nums[j] < nums[k])
//                    k = j;
//            }
//            int temp=nums[i];
//            nums[i]=nums[k];
//            nums[k]=temp;
//        }
    }

    static void quickSort(int nums[], int low, int high) {
        if (low < high) {
            int pi = partition(nums, low, high);
            quickSort(nums, low, pi);
            quickSort(nums, pi + 1, high);
        }
    }

    static int partition(int nums[], int low, int high) {
        int pivot = nums[low];  // pivot is the first element
        int i = low - 1;
        int j = high + 1;

        while (true) {
            // Move i to the right until an element >= pivot is found
            do {
                i++;
            } while (nums[i] < pivot);

            // Move j to the left until an element <= pivot is found
            do {
                j--;
            } while (nums[j] > pivot);

            // If pointers have crossed, return partition index
            if (i >= j)
                return j;

            // Swap elements at i and j
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    static void mergeSort(int nums1[], int n){

        int nums2[]={1,5,7,9,10};
        int m=5;

        int mergeArray[] = new int[m+n];
        int k=0; //index for Merged Array

        int i=0,j=0;
        while(i<n&&j<m){
            if(nums1[i]<=nums2[j]){
                mergeArray[k++]=nums1[i++];
            }else
                mergeArray[k++]=nums2[j++];
        }

        while(i<n){
            mergeArray[k++]=nums1[i++];
        }

        while(j<m){
            mergeArray[k++]=nums2[j++];
        }

        System.out.print("Merged Array elements are : ");
        for(i=0;i<m+n;i++)
            System.out.print(mergeArray[i]+" ");
    }
}
