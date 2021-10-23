
public class Armstrong {

	public static void main(String[] args) {
		int n=371,m,r,result=0;
		m=n;
		while(m!=0)
		{
			r=m%10;
		result=result+(r*r*r);
			m=m/10;
			
		}
		if(result==n) {
		
		System.out.println( "armstrong number");
		}
		else
		{
			System.out.println(" not armstrong number");
		}
		
			
		
	}	

	}

