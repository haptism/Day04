package com.iu.array2;

import java.util.Scanner;

public class Array_2_test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//총 심판이 5명
		//점수는 정수로
		//평균을 구하는데, 
		int [] points = new int[5];
		for(int i=0;i<points.length;i++) {
			System.out.println(1+i+" 번 점수 입력");
			points[i] = sc.nextInt();
		}
		
		//평균. 최대점수와, 최소 점수를 제외한 평균
		int max=points[0];
		int min=points[0];
		
		for(int i=1;i<points.length;i++) {
			if(max<points[i]) {
				max=points[i];
			}
			if(min>points[i]) {
				min=points[i];
			}
			
		}
		
		int total=0;
		for(int i=0;i<points.length;i++) {
			total=total+points[i];
		}
		
		double avg = (double)(total-max-min)/(points.length-2);
		
		System.out.println(avg);
		
		
		

	}

}
