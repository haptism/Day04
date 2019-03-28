package com.iu.array1;

import java.util.Scanner;

public class ArrayTest_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar = {10, 32, 15, 27, 46, 52, 60};
		
		//인덱스 입력 받아서 해당 인덱스번호의 값을 출력
		//다른 번호를 입력하면 없는 번호 입니다를 출력 
		System.out.println("번호를 입력");
		int index = sc.nextInt();
		
		if(index>ar.length || index<0) {
			System.out.println("없는 번호");
		}else {
			System.out.println(ar[index]);
		}
		

	}

}
