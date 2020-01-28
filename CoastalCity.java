import java.util.ArrayList;

public class CoastalCity extends CityInAustralia{
	String output = "";

	public CoastalCity(String n, int p, double d, ArrayList<Hospitals> h, ArrayList<Beaches> b) {
		super(n, p, d, h, b);
		
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
