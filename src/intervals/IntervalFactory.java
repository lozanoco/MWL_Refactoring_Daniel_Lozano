package intervals;

public class IntervalFactory {
	
	private static String TYPE="";

	public static Interval getInterval(double minimum, double maximum, Opening opening) {
		return new BothOpenedInterval(minimum, maximum, opening);
	}
}
