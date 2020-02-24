package day_06_self;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx11_정답 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{
			
			int[] arr = new int[5];
			int[] check = new int[5];
			
			System.out.println("1.랜던 숫자 돌리기");
			System.out.println("2.프로그램 종료");
			
			System.out.println("메뉴를 선택해주세요");
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
				System.out.println("프로그램을 종료하겠습니다.");
				break;
			}
		}
	}
}
