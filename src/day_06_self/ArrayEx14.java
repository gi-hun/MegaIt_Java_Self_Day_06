/*
 * # 숫자이동[1단계]
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 */

package day_06_self;

import java.util.Scanner;

public class ArrayEx14 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int[] game = {0,0,2,0,0,0,0};
		
		int check = 0;
		for(int i=0; i<7;i++)
		{
			if(game[i] == 2)
			{
				check = i;
			}
		}
		
		while(true)
		{	
			for(int i=0; i<7;i++)
			{
				if(game[i] == 2)
				{
					System.out.print("옷 ");
				}
				else
				{
					System.out.print(game[i]+" ");
				}
			}
			
			System.out.print("왼쪽[1] 오른쪽[2] 입력:");
			int dir = sc.nextInt();
			
			if(dir == 1)
			{
				if(check <0)
				{
					System.out.println("범위 벗어남");
					break;
				}
				else
				{
					game[check - 1] = 2;
					game[check] = 0 ;
					check--;
				}

			}
			System.out.println("check1: "+check);
			if(dir == 2)
			{
				if(check>6)
				{
					System.out.println("범위 벗어남");
					break;
				}
				else
				{
					game[check + 1] = 2;
					game[check] = 0 ;
					check++;
				}
			}
			System.out.println("check2: "+check);
			
		}
	}
}
