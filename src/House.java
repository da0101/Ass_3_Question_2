
public class House {

	private int age;
	private String typeOfHouse;
	private double cost;

	House() {
		this.age = 50;
		this.typeOfHouse = "Attached";
		this.cost = 100000;
	}

	House(int cost) {
		this.age = 50;
		this.typeOfHouse = "Attached";
		this.cost = cost;
	}

	House(int age, int cost) {
		this.age = age;
		this.typeOfHouse = "Attached";
		this.cost = cost;
	}

	House(int age, String typeOfHouse, int cost) {
		this.age = age;
		this.typeOfHouse = typeOfHouse;
		this.cost = cost;
	}

	public int getAge() {
		return age;
	}

	public String getTypeOfHouse() {
		return typeOfHouse;
	}

	public double getCost() {
		return cost;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setTypeOfHouse(String typeOfHouse) {
		this.typeOfHouse = typeOfHouse;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setAgeTypeAndCost(int age, String typeOfHouse, int cost) {
		this.age = age;
		this.typeOfHouse = typeOfHouse;
		this.cost = cost;

	}

	public void setAgeAndCost(int age, int cost) {
		this.age = age;
		this.cost = cost;
	}
	
	public String toString() {
		return new String("This House is type " + typeOfHouse + ". Its age is " + age + " and it costs " + cost);
	}
	
	public boolean equals(House house) {
		return house != null && (house.age == age) && (house.typeOfHouse == typeOfHouse) && (house.cost == cost);
	}
	
	public boolean isGreaterThan(House house) {
		return house != null && house.cost < cost;
	}
	
	public boolean isLessThan(House house) {
		return house != null && house.cost > cost;
	}
	

	public double estimatePrice(int age, String typeOfHouse) {
		double appreciation = 0;
		double estimatedPrice = 0;
		if (typeOfHouse.equalsIgnoreCase("Attached")) {
			estimatedPrice = 100000;
			for (int i = 0; i < age; i++) {
				if (i < 5) {
					appreciation += cost / 100;
				} 
				else {
					appreciation += ((cost / 100) * 2);
				}
			}
			estimatedPrice += appreciation;
		}
		else if (typeOfHouse.equalsIgnoreCase("Semidetached")) {
			estimatedPrice = 150000;
			for (int i = 0; i < age; i++) {
				if (i < 5) {
					appreciation += ((cost / 100) * 2);
				} 
				else {
					appreciation += ((cost / 100) * 3);
				}
			}	
			estimatedPrice += appreciation;
		}
		else if (typeOfHouse.equalsIgnoreCase("Detached")) {
			estimatedPrice = 200000;
			for (int i = 0; i < age; i++) {
				appreciation += ((cost / 100) * 2);
			}
			estimatedPrice += appreciation;
		}
		else {
			System.out.println("No such type");
			return 0;
		}
		return estimatedPrice;
	}

}
