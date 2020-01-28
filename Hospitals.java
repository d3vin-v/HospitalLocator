import java.util.*;

public class Hospitals {
	private String name;
	private CityInAustralia city;
	

	public Hospitals() {
		
	}
	public Hospitals(String n, CityInAustralia c) {
		name = n;
		city = c;
	}
	
	public CityInAustralia hospsFind(ArrayList<CityInAustralia> a, String h, String f) {
		//get name of cities, compare them to string of hosp name
		for(int i = 0; i < a.size(); i++) {
			if(h.equals(a.getName(i))) {
				return a.get(i);
			}
		}
		
		return city;
	}

}
