package Arrays.Rk;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr = new int[sc.nextInt()];
//		int[n]=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter a number");
			arr[i]=sc.nextInt();
		}
		System.out.println("Given data is:-");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
