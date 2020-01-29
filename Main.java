import java.util.*;

class Main {
	public static void main(String[] args) {
		
		//mount archer park, hospital named after city

		ArrayList<Parks> parks = new ArrayList<Parks>();
		ArrayList<Beaches> beaches = new ArrayList<Beaches>();
		ArrayList<Hospitals> hosps = new ArrayList<Hospitals>();

		CityInAustralia c1 = new CoastalCity("Darwin", 148564, .6, hosps, beaches);
		CityInAustralia c2 = new CoastalCity("Sydney", 5230000, 10.5, hosps, beaches);
		CityInAustralia c3 = new CoastalCity("Brisbane", 2274560, 20.6, hosps, beaches);
		CityInAustralia c4 = new CoastalCity("Melbourne", 4936000, 5.5, hosps, beaches);
		CityInAustralia c5 = new CoastalCity("Perth", 2059484, 12, hosps, beaches);
		CityInAustralia c6 = new InlandCity("Rockhampton", 80665, 29.2, hosps, parks);
		CityInAustralia c7 = new InlandCity("Bendingo", 99122, 6.4, hosps, parks);
		CityInAustralia c8 = new InlandCity("Toowoomba", 134037, 39.4, hosps, parks);
		CityInAustralia c9 = new InlandCity("Wagga Wagga", 64820, 29.2, hosps, parks);
		CityInAustralia c10 = new InlandCity("Alice Springs", 29534, 5, hosps, parks);
		
		ArrayList<CityInAustralia> cities = new ArrayList<CityInAustralia>();
		cities.add(c1);
		cities.add(c2);
		cities.add(c3);
		cities.add(c4);
		cities.add(c5);
		cities.add(c6);
		cities.add(c7);
		cities.add(c8);
		cities.add(c9);
		cities.add(c10);
		
		
		System.out.println("Name" + "\t\t" + "Population" + "\t" + "Distance" + "\t" + "Coastal or Inland?");
		for(int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}
		
//		Hospitals.hospsFind(cities){
//			
//		}
	}
}