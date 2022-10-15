package Arrays.Rk;
import java.util.Arrays;

public class Student implements Comparable<Object>{
	String name;
	int id;
	Student(String name,int id)
	{
		this.name=name;
		this.id=id;
			
	}
	public String toString()
	{
		return name +"\t"+ id;
	}
	
	@Override
	public int compareTo(Object o) {
		
		Student s=(Student)o;
		
		if(this.id>s.id)
		{
			return 1;
		}
		else if(this.id<s.id)
		{
			return -1;
			
		}
		else
			return 0;
	}
	public static void main(String[] args) {
		Student [] s=new Student[3];
		s[0]=new Student("Sam", 14);
		s[1]=new Student("Rebel", 143);
		s[2]=new Student("Pandi", 420);
		System.out.println("Before sorting:-");
		for(int i=0;i<s.length;i++)
		{
			System.out.println( s[i]);
		}
		System.out.println("After sorting:-");
		for(int i=0;i<s.length;i++)
		{
			Arrays.sort(s);
			System.out.println( s[i]);
		}
		}
}
