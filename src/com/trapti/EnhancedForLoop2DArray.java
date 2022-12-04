package com.trapti;

public class EnhancedForLoop2DArray {
    public static void main(String[] args) {
        int p[][] ={
                {5,4,2,4},
                {7,1,0,9},
                {3,6,8,5}
        };
        for (int i[] : p) {
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println(' ');
        }
    }
}
