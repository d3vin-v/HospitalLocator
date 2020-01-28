import java.util.ArrayList;

public class InlandCity extends CityInAustralia{
	String output = "";
	
	public InlandCity(String n, int p, double d, ArrayList<Hospitals> h, ArrayList<Parks> pa) {
		super(n, p, d, h, pa);
		
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
		output += "Inland";
		
		return output;
	}

}
