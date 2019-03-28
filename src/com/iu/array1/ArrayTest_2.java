package com.iu.array1;

import java.util.Scanner;

public class ArrayTest_2 {

	public static void main(String[] args) {
		//정수 3개를 모을 배열 선언
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기를 입력");
		int count = sc.nextInt();//3
		
		
		int [] ar = new int[count];
		
		//배열 생성시, 이미 데이터가 있는 경우
		int [] ar2 = {10, 20, 30};
		System.out.println("검색할 번호를 입력하세요");
		count = sc.nextInt();
		//1 입력하면 20 출력
		//0 입력하면 10 출력
		System.out.println(ar2[count]);
		
		//length - 자기배열의 크기(칸수) size
		System.out.println(ar.length);

	}

}
