package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// print the given number is even or odd without using modulous operator.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n&1)==1){
            System.out.println("Number is odd");
        }
        else{
            System.out.println("Number is even");
        }

    }
}
