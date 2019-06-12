
public class Square extends Quadrangle 
{
	public float height=0;
	
	public Square(float height) 
	{		
		super(height);	
		this.height = height;
	}
	@Override
	public float getArea() {
		return height*height;
	}
	
	
}
