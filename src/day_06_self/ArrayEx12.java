/*
 * # �� ��ü�ϱ�[2�ܰ�] 
 */
// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
// ��    1) �ε���1 �Է� : 1
//		   �ε���2 �Է� : 3
//		  {10, 40, 30, 20, 50}

// ���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�
// ��    2) ��1 �Է� : 40
//        ��2 �Է� : 20
//		  {10, 20, 30, 40, 50}
// ���� 3) �й� 2���� �Է¹޾� ���� ��ü�ϱ�
// ��    3) �й�1 �Է� : 1002
//        �й�2 �Է� : 1003
//		 {87, 45, 11, 98, 23}

package day_06_self;

import java.util.Scanner;

public class ArrayEx12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		
		System.out.println("����1: �ε��� �� ��ü");
		System.out.println("1.�ε��� �Է�");
		int num1 = sc.nextInt();
		System.out.println("2.�ε��� �Է�");
		int num2 = sc.nextInt();
		
		int temp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = temp;
		
		for(int i=0; i<5; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println("");
		
		System.out.println("����2: �� ��ü");
		System.out.println("1.�� �Է�");
		num1 = sc.nextInt();
		System.out.println("2.�� �Է�");
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
		
		System.out.println("����3: ���� ��ü");
		System.out.println("1.�й� �Է�");
		num1 = sc.nextInt();
		System.out.println("2.�й� �Է�");
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
