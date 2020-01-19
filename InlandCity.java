public class InlandCity extends CityInAustralia{
	private String name;
	private int pop;
	private int distance;
	String output = "";
	
	public InlandCity(String n, int p, int d) {
		super(n, p, d);
		name = n;
		pop = p;
		distance = d;
		
	}
	
	public String toString() {
		output += name + "\t";
		output += pop + "\t" + "\t";
		output += distance + "\t" + "\t";
		output += "Inland";
		
		return output;
	}

}
