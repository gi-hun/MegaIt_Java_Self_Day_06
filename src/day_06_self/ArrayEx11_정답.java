package day_06_self;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx11_���� {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{
			
			int[] arr = new int[5];
			int[] check = new int[5];
			
			System.out.println("1.���� ���� ������");
			System.out.println("2.���α׷� ����");
			
			System.out.println("�޴��� �������ּ���");
			int menu = sc.nextInt();
			
			if(menu == 1)
			{
				for(int i=0; i<5; i++)
				{
					int num = ran.nextInt(5);
					
					arr[i] = num;
					if(check[num] == 0)
					{
						check[num] = 1;
					}
					else
					{
						i--;
					}
				}
				
				System.out.print("[");
				for(int i=0; i<5; i++)
				{
					System.out.print(arr[i]);
				}
				System.out.println("]");
			}
			
			else if(menu == 2)
			{
				System.out.println("���α׷��� �����ϰڽ��ϴ�.");
				break;
			}
		}
	}
}
