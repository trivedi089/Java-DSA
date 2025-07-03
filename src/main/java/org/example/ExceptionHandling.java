package org.example;


import jdk.jfr.StackTrace;

import static jdk.incubator.vector.Float16.divide;

//3 types of errors :
//1. Compilation error
//2. Logical error
//3. Runtime error
public class ExceptionHandling {

    public static void main(String[] args) {

        int[] numerators = {10, 20, 30, 40};
        int[] denominators = {5, 10, 0, 20};

        for (int i = 0; i < 4; i++) {
            System.out.print(divide(numerators[i], denominators[i])+" ");
        }

        System.out.println("Good Job");
    }

    public static int divide(int a, int b) {
        try{
            return a / b;
        }catch(ArithmeticException e){
//            StackTraceElement[] stackTraceElements = e.getStackTrace();
//            for(int i=0;i<stackTraceElements.length;i++){
//                System.out.println(stackTraceElements[i]);
//            }
            System.out.println(e);
            return -1;
        }
        finally {
            System.out.println("Good Job");
        }
    }

}
