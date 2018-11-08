// -------------------------------------------------------
// Assignment_3 Question_2
// Written by: Danil Ulmashev 27033389
// For COMP 248 Section EE – Fall 2018
// --------------------------------------------------------
// --------------------------------------------------------
// A simple Java program to welcome the user and test the 
// new class House and all of its methods and attributes. 
// Class House contains accessor methods and as well as 
// mutator methods. Objects of type House may be compared
// between each other, and price of the house may be 
// estimated according to the type and age.
// --------------------------------------------------------
// --------------------------------------------------------
public class House {

	// Private 
	//=======================
	private int age;
	private String typeOfHouse;
	private double cost;
	//=======================

	// Constructors 
	//=======================
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
	//=======================

	// Accessor methods.
	//=======================
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
	//=======================

	// Mutator methods. 
	//=======================
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
	//=======================
	
	// Method toString to print out the attributes of the class. 
	//=======================
	public String toString() {
		return new String("This House is type " + typeOfHouse + ". Its age is " + age + " and it costs " + cost);
	}
	//=======================
	
	// Methods to compare objects.
	//=======================
	public boolean equals(House house) {
		return house != null && (house.age == age) && (house.typeOfHouse == typeOfHouse) && (house.cost == cost);
	}
	
	public boolean isGreaterThan(House house) {
		return house != null && house.cost < cost;
	}
	
	public boolean isLessThan(House house) {
		return house != null && house.cost > cost;
	}
	
	// Estimating the price of the house.
	//=======================
	public double estimatePrice(int age, String typeOfHouse) {
		double appreciation = 0;
		double estimatedPrice = 0;
		if (typeOfHouse.equalsIgnoreCase("Attached")) {
			estimatedPrice = 100000;
			// Calculating the percentage 
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
			// Calculating the percentage 
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
			// Calculating the percentage 
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
