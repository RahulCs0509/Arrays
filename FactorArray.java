package Arrays.Rk;

import java.util.Scanner;

public class FactorArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number : - ");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter "+n+" number : - ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if(720%arr[i]==0)
			{
				System.out.println("Factor of 720 is:- "+arr[i]);
			}
		}
		
	}

}
