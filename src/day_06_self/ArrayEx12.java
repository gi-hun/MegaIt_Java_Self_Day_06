/*
 * # 값 교체하기[2단계] 
 */
// 문제 1) 인덱스 2개를 입력받아 값 교체하기
// 예    1) 인덱스1 입력 : 1
//		   인덱스2 입력 : 3
//		  {10, 40, 30, 20, 50}

// 문제 2) 값 2개를 입력받아 값 교체하기
// 예    2) 값1 입력 : 40
//        값2 입력 : 20
//		  {10, 20, 30, 40, 50}
// 문제 3) 학번 2개를 입력받아 성적 교체하기
// 예    3) 학번1 입력 : 1002
//        학번2 입력 : 1003
//		 {87, 45, 11, 98, 23}

package day_06_self;

import java.util.Scanner;

public class ArrayEx12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		
		System.out.println("문제1: 인덱스 값 교체");
		System.out.println("1.인덱스 입력");
		int num1 = sc.nextInt();
		System.out.println("2.인덱스 입력");
		int num2 = sc.nextInt();
		
		int temp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = temp;
		
		for(int i=0; i<5; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println("");
		
		System.out.println("문제2: 값 교체");
		System.out.println("1.값 입력");
		num1 = sc.nextInt();
		System.out.println("2.값 입력");
		num2 = sc.nextInt();
		
		int count1=0;
		int count2=0;
		
		for(int i=0; i<5; i++)
		{
			if(num1 == arr[i])
			{
				count1 = i;
			}
			if(num2 == arr[i])
			{
				count2 = i;
			}
		}
		
		temp = arr[count1];
		arr[count1] = arr[count2];
		arr[count2] = temp;
		
		for(int i=0; i<5; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("");
		
		int[] id = {1001, 1002, 1003, 1004, 1005};
		int[] score  = {  87,   11,   45,   98,   23};
		
		System.out.println("문제3: 성적 교체");
		System.out.println("1.학번 입력");
		num1 = sc.nextInt();
		System.out.println("2.학번 입력");
		num2 = sc.nextInt();
		
		count1=0;
		count2=0;
		
		for(int i=0; i<5; i++)
		{
			if(num1 == id[i])
			{
				count1 = i;
			}
			
			if(num2 == id[i])
			{
				count2 = i;
			}
		}
		
		temp = score[count1];
		score[count1] = score[count2];
		score[count2] = temp;
		
		for(int i=0; i<5; i++)
		{
			System.out.print(score[i] + " ");
		}
	}
}
