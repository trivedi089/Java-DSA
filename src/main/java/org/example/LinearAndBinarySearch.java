package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LinearAndBinarySearch {
    public static void main(String[] args) {

        System.out.println("Welcome to Liner Searching Algorithm :)");
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("Please enter the elements in the array");
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
        }

        int target;
        System.out.print("Enter number to search: ");
        target = sc.nextInt();

        System.out.println("Press 1 for Liner Search and 2 for Binary Search");
        int choice = sc.nextInt();
        int indexTarget;
        if(choice==1)
            indexTarget = findTargetByLinearSearch(nums,target);
        else
            indexTarget = findTargetByBinarySearch(nums,target);

        if(indexTarget==-1)
            System.out.println("No such number exists in the given array");
        else
            System.out.println("Found number at index number "+indexTarget);
    }

    static int findTargetByLinearSearch(int nums[], int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                return i;
        }
        return -1;
    }
    static int findTargetByBinarySearch(int nums[],int target){
        int low=0,high=nums.length-1;


        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
}