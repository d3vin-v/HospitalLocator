class CityInAustralia {
	private String name;
	private int pop;
	private double distance;
	private String output = "";

	public CityInAustralia(String n, int p, double d) {
		name = n;
		pop = p;
		distance = d;
	}
	
	public String toString() {
		output += name + "\t";
		output += pop + "\t";
		output += distance + "\t";
		return output;
	}
	
}