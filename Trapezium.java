
public class Trapezium extends Quadrangle{

	public float height=0;
	public float arm=0;
	public float width=0;
	public Trapezium(float height, float width, float base) {
		super(height, width, base);
		this.height =height;
		this.width = width;
		this.arm = base;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return ((height/2)*(width+arm));
	}

}