package com.iu.array1;

import java.util.Scanner;

public class ArrayTest_1 {

	public static void main(String[] args) {
		//배열 
		//여러 데이터의 묶음
		//하나의 변수로 여러개의 데이터를 다루고자 할때
		//같은 데이터 타입 만 묶음
		//배열 생성시 몇개를 만들지를 미리 생성
		//만들어진 배열의 크기는 수정이 불가.
		int a = 10;
		int b = 20;
		//메모리영역
		//static, stack, heap
		int [] ar2 = new int[2];
		ar2[0]=a;
		ar2[1]=b;
		//배열 선언
		//모을데이터타입 변수명 [] ;
		//모을데이터타입 [] 변수명;
		
		//정수형데이터
		int [] ar = new int[3];
		System.out.println(ar);
		ar[0]='a';
		ar[1]=20;//인덱스 번호를 사용
		ar[2]=(int)3.2;
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		//문자 5개를 담을 배열을 선언하고
		//각각 문자를 입력하고 출력
		char [] ch = new char[5];
		ch[0]='a';
		ch[1]='b';
		
		int [] num;//변수 선언
		num = new int[3];
		System.out.println(num);
		System.out.println(num[0]);
		
		String name="abc";
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
		
		
			
	}

}
