package intervals;

public class Point {

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
	
	public boolean isGreater(double value){
		return this.value > value;
	}
	
	public boolean isLower(double value){
		return this.value < value;
	}

	public boolean isGreaterOrE(double value) {
		return this.value >= value;
	}

	public boolean isLowerOrE(double value) {
		return this.value <= value;
	}
	

}
