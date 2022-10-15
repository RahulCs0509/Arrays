package Arrays.Rk;

 public class StudentObjArr {
	String name;
	int id;
	StudentObjArr(String name,int id)
	{
		this.name=name;
		this.id=id;
			
	}
	public String toString()
	{
		return name +"\t"+ id;
	}
	
	public static void main(String[] args) {
		StudentObjArr [] s=new StudentObjArr[3];
		s[0]=new StudentObjArr("Sam", 14);
		s[1]=new StudentObjArr("Rebel", 143);
		s[2]=new StudentObjArr("Pandi", 420);
		for(int i=0;i<s.length;i++)
		{
//			Arrys.sort();
			System.out.println(s[i]);
//			System.out.println(s[i].id);
		}
	}
}
