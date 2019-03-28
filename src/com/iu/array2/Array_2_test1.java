package com.iu.array2;

import java.util.Scanner;

public class Array_2_test1 {

	public static void main(String[] args) {
		//데이터타입
		// primitive Type
		//	int, long
		//  double, float
		//  char
		//  boolean
		// reference Type
		//20L, 21, 3.2, 3.2F 'a' "a" true
		Scanner sc = new Scanner(System.in);
		int [] ar = new int [3];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		
		int [] ar2 = new int[2];
		ar2[0] = 1;
		ar2[1] = 2;
		
		
		//ar = ar2;
		System.out.println(ar[0]);
		
		System.out.println(ar2[1]);
		
		ar = new int[2];
		System.out.println(ar[0]);
		
		
		

	}

}
