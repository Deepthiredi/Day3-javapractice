public class Laptop
	{
		String lname;
		double price;
		String color;
		int lid;
		Laptop(String lname,double price,String color,int lid)
		{
			this.lname=lname;
			this.price=price;
			this.color=color;
			this.lid=lid;
		}
		Laptop(String lname,Double price)
		{
			this.lname=lname;
			this.price=price;
		
		}
		Laptop(String color)
		{
			this.color=color;
		}
		Laptop(int lid)
		{
			this.lid=lid;
		}

	     public void printDetails()
	     {
			System.out.println(lname);
			System.out.println(price);
			System.out.println(color);
			System.out.println(lid);
		}
	}
		

		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	


