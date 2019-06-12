import java.util.Scanner;

public class Area 
{
	
	public static Quadrangle getAreaOf(String s, float h, float w)
	{
		switch(s)
		{
			case "Square":
				System.out.println("Case Square");
				if(h!=w) 
				{
					System.out.println("height and width of a square should be equal");
					return  null;
				}
				else
				{
					return  new Square(h);
				}
			case "Rectangle":
				return new Rectangle(h, w);
			case "Parallelogram":
				return new Parallelogram(h, w);
			case "Trapezium":
				System.out.println("Enter the arm of triangle of the Trapezium");
				Scanner sc = new Scanner(System.in);
				float b = sc.nextFloat();
				sc.close();
				return new Trapezium(h, w, b);
		    default:
		    	System.out.println("Invalid Shape");
		    	return null;
		}
		
				
	}
	
}
