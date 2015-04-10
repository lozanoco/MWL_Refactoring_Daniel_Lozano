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
	
	public abstract boolean isGreater(double value);
	
	public abstract boolean isLower(double value);


}
