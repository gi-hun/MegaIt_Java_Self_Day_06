/*
 * # 4�� ����� ����
 * - arr �迭���� 4�� ����� ��� temp �迭�� ����
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
		
		temp = new int[count];		//count�̿��ؼ� temp �迭 ���� �������ش�
		int j =0;
		
		for(int i=0; i<5; i++)
		{
			if(arr[i]%4 == 0)
			{
				temp[j] = arr[i];
				j++;		//j�� ���������� ������ temp�迭�� ù��° ������ ��� ���� ���� �ȴ�. -> 76 0 0 �̷��� �����
			}
		}
		
		for(int i=0; i<count; i++)
		{
			System.out.print(temp[i] + " ");
		}
	}
}
