/*
 * # 4의 배수만 저장
 * - arr 배열에서 4의 배수만 골라 temp 배열에 저장
 */

package day_06_self;

public class ArrayEx13 {
	public static void main(String[] args) {
		
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		
		int count = 0;
		
		for(int i=0; i<5; i++)
		{
			if(arr[i]%4 == 0)
			{
				count++;
			}
		}
		
		temp = new int[count];		//count이용해서 temp 배열 먼저 생성해준다
		int j =0;
		
		for(int i=0; i<5; i++)
		{
			if(arr[i]%4 == 0)
			{
				temp[j] = arr[i];
				j++;		//j를 증가해주지 않으면 temp배열의 첫번째 공간에 계속 값이 저장 된다. -> 76 0 0 이렇게 저장됨
			}
		}
		
		for(int i=0; i<count; i++)
		{
			System.out.print(temp[i] + " ");
		}
	}
}
