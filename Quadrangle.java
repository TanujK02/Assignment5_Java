
public abstract class Quadrangle 
{
	public float height=0;
	public float width=0;
	public float area=0;
	public float base=0;
	
	public Quadrangle(float height, float width, float base) {
		
		this.height = height;
		this.width = width;
		this.base = base;
	}
	public Quadrangle(float height, float width) {
		
		this.height = height;
		this.width = width;
	}
	public Quadrangle(float height) {
		
		this.height = height;
		
	}

	public float getHeight() {
		return height;
	}

	public float getWidth() {
		return width;
	}

	public abstract float getArea();

	public void setHeight(float height) {
		this.height = height;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	
}
