class CityInAustralia {
	private String name;
	private int pop;
	private boolean coastal;
	private String output = "";

	public CityInAustralia(String n, int p, boolean c) {
		name = n;
		pop = p;
		coastal = c;
	}
	
	
	
	
	public String toString() {
		output += name + "\t";
		output += pop + "\t";
		if(coastal) {
			output += "Coastal";
		}else if(!coastal) {
			output += "Inland";
		}
		return output;
	}
}