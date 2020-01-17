class CityInAustralia {
	private String name;
	private int pop;
	private int distance;
//	private boolean coastal;
	private String output = "";

	public CityInAustralia(String n, int p, int d) {
		name = n;
		pop = p;
		distance = d;
//		coastal = c;
	}
	
	public String toString() {
		output += name + "\t";
		output += pop + "\t";
		output += distance + "\t";
//		if(coastal) {
//			output += "Coastal";
//		}else if(!coastal) {
//			output += "Inland";
//		}
		return output;
	}
	
}