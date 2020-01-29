import java.util.*;

class CityInAustralia {
	protected String name;
	protected int pop;
	protected double distance;
	private String output = "";

	public CityInAustralia(String n, int p, double d, ArrayList<Hospitals> h, ArrayList b) {
		name = n;
		pop = p;
		distance = d;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		output += name + "\t";
		output += pop + "\t";
		output += distance + "\t";
		return output;
	}
	
}