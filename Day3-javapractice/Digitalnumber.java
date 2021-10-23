import java.util.Scanner;

public class Digitalnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value m:");
		int m=sc.nextInt();
		System.out.println("enter the value n:");
		int n=sc.nextInt();
		if(m<n&&m>0&&n>0) {
		for(int i=m+1;i<=n-1;i++)
		{
			System.out.println(i);
		}
		
				

	}
		else
	{
		for(int i=m-1;i>n;i--)
		{
			System.out.println(i);
		}
	}

}
}
