package intervals;

public abstract class Point {

	private double value;
	
	public Point(double value){
		this.value=value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	public abstract boolean isGreater(Point maximum);
	
	public abstract boolean isLower(Point minimum);


}
