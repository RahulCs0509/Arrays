package Arrays.Rk;

import java.util.Scanner;

public class OddNum_B {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[10];
		for(int i=0;i<arr.length;i++)
			{
				System.out.println("enter a number:-");
				arr[i]=sc.nextInt();
			}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println("Odd Index are:-"+arr[i]);
			}
		}
		
	}
}
