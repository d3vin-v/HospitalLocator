import java.util.*;

public class Hospitals {
	private String name;
	private Hospitals hosp;
	private CityInAustralia city;
	

	public Hospitals() {
		
	}
	public Hospitals(String n, CityInAustralia c) {
		name = n;
		city = c;
	}
	
	public String getName() {
		return name;
	}
	
	public CityInAustralia hospsFind(ArrayList<CityInAustralia> a, ArrayList<Hospitals> h) {
		//get name of cities, compare them to string of hosp name
		for(int i = 0; i < h.size(); i++) {
			hosp = h.get(i);
			for(int j = 0; j < a.size(); j++) {
				city = a.get(j);
				if(name.equals(city.getName())) {
					return a.get(j);
				}
			}
		}
		return city;
	}

}
