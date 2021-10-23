import java.util.Scanner;

public class Perfectnum{

	public static void main(String[] args) {
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number is :");
		n=s.nextInt();
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("given number is perfect");
			
		}
		else
		{
			System.out.println("given number is not perfect");
		}
	}
		
	}

