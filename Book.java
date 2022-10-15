package Arrays.Rk;

import java.util.Arrays;

public class Book implements Comparable<Object> {
	String name,aname;
	int pno;
	Book(String name,String aname,int pno)
	{
		this.name=name;
		this.aname=aname;
		this.pno=pno;
	}
	public String toString()
	{
		return "Book_Name:_ "+name +" \t Book_AName:_ "+ aname +"\t Book PageNo:_ "+ pno;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return pno;
	}
	public static void main(String[] args) {
		Book [] b=new Book[3];
		b[0]=new Book("JAVA","RAHUL RAI",140);
		b[1]=new Book("SQl","SAM",141);
		b[2]=new Book("HTML","REBEL",145);
		Arrays.sort(b);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
	
	

}
