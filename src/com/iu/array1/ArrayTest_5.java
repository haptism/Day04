package com.iu.array1;

import java.util.Scanner;

public class ArrayTest_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//학생수를 입력하세요.3
		//입력한 수만큼 학생의 이름을 입력하세요
		//내가 입력한 학생수만큼 이름이 출력
		System.out.println("학생 수 입력");
		int count = sc.nextInt();//3
		
		String [] names = new String[count];
		
		for(int i=0;i<names.length;i++) {
			System.out.println(i+1+" 번째 이름 입력");
			names[i]=sc.next();
		}
		
		int [] kors = new int[names.length];
		for(int i=0;i<kors.length;i++) {
			System.out.println(names[i]+" 학생의 점수 입력");
			kors[i] = sc.nextInt();
		}
		int [] math = new int[names.length];
		for(int i=0;i<math.length;i++) {
			System.out.println(names[i]+" 학생의 점수 입력");
			math[i] = sc.nextInt();
		}
		
		int kTotal=0;
		int mTotal=0;
		for(int i=0;i<names.length;i++) {
			kTotal = kTotal+kors[i];
			mTotal = mTotal+math[i];
		}
		System.out.println("KOR : "+kTotal/names.length);
		System.out.println("Math: "+mTotal/names.length);
		
		//학생수 만큼  수학 점수를 입력,.
		//  iu 학생의 국어 점수 입력
		//  suji 학생의 국어 점수 입력
		
		//국어점수 반평균
		//수학점수 반평균
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+" : "+kors[i]);
		}
		
		
		

	}

}
