import java.util.Scanner;

public class Student_Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String sname=sc.next();
		int sid=sc.nextInt();
		String sbranch=sc.next();
		long phno=sc.nextLong();
		Student s1=new Student(sname,sid,sbranch,phno);
		Student s2=new Student(sid,sbranch);
		System.out.println("  ");
		System.out.println(s1.getsid());
		System.out.println(s1.getsname());
		
		
		}
}
	

	
		