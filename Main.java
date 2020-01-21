import java.util.*;

class Main {
	public static void main(String[] args) {
		
		//mount archer park, hospital named after city

		CityInAustralia c1 = new CoastalCity("Darwin", 148564, .6);
		CityInAustralia c2 = new CoastalCity("Sydney", 5230000, 10.5);
		CityInAustralia c3 = new CoastalCity("Brisbane", 2274560, 20.6);
		CityInAustralia c4 = new CoastalCity("Melbourne", 4936000, 5.5);
		CityInAustralia c5 = new CoastalCity("Perth", 2059484, 12);
		CityInAustralia c6 = new InlandCity("Rockhampton", 80665, 29.2);
		CityInAustralia c7 = new InlandCity("Bendingo", 99122, 6.4);
		CityInAustralia c8 = new InlandCity("Toowoomba", 134037, 39.4);
		CityInAustralia c9 = new InlandCity("Wagga Wagga", 64820, 29.2);
		CityInAustralia c10 = new InlandCity("Alice Springs", 29534, 5);
		
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
//		System.out.println(c1 + "\n" + c2 + "\n" + c3 + "\n" + c4 + "\n" + c5 + "\n" + c6 + "\n" + c7 + "\n" + c8 + "\n" + c9 + "\n" + c10);
		for(int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}
	}
}