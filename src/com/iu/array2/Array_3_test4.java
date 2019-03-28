package com.iu.array2;

import java.util.Arrays;

public class Array_3_test4 {

	public static void main(String[] args) {
		//배열은 같은 데이터타입 묶는다.
		int [] num1 = {1, 2, 3};
		int [] num2 = {4, 5};
		int [][] nums = new int[2][];
		nums[0] = num1;
		nums[1] = num2;
		
		System.out.println(nums[0][1]);
		System.out.println(nums[1][0]);
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.println(nums[i][j]);
			}
		}
		
		

	}

}
