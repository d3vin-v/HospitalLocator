public class CoastalCity extends CityInAustralia{
	private String name;
	private int pop;
	private double distance;
	String output = "";

	public CoastalCity(String n, int p, double d) {
		super(n, p, d);
		name = n;
		pop = p;
		distance = d;
		
	}
	
	public String toString() {
		output += name;
		if(name.length() < 7) {
			output += "\t\t";
		}else if(name.length() >= 7) {
			output += "\t";
		}
		output += pop + "\t\t";
		output += distance + "\t\t";
		output += "Coastal";
		
		return output;
	}
}