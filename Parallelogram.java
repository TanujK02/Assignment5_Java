
public class Parallelogram extends Quadrangle {

	public float height=0;
	public float width=0;
	public Parallelogram(float height, float width) {
		super(height, width);
		this.height =height;
		this.width = width;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return height*width;
	}

}
