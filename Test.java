import java.util.Scanner;

public class Test
{

	public static void main(String[] args) 
	{
		System.out.println("Please Enter the name of shape");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("Please Enter the hieght");
		float h = sc.nextFloat();
		System.out.println("Please Enter the width/base");
		float w = sc.nextFloat();
		Quadrangle qd = Area.getAreaOf(s, h, w);
		if(qd == null)
		{
			System.out.println("Something went wrong please try again");
		}
		else 
		{
			System.out.println("Area of the shape is:"+qd.getArea());
		}
		sc.close();
	}

}
