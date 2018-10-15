package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int [] array1={2, 1 , 3, 20, 66, 4, 56, 44, 10, 51, 34, 17, 89, 90, 66, 58, 41, 67, 32, 97};
	double average=0, sum=0;
	if(array1.length>0){
        for (int i = 0; i <array1.length  ; i++) {
            sum+=array1[i];

        }
    }
    average=sum/array1.length;
        System.out.println(Arrays.toString(array1));
        System.out.println(average);
    }
}
