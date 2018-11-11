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
public class Main {

	public static void main(String[] args) {
		// Declaring objects of type House.
		House H1  = new House(1950, 100000);
		House H2  = new House(1950, 100000);
		House H3  = new House(4, 120000);
		House H4  = new House(2, "Detached", 220000);
		House H5 = new House();
		House H6 = new House(110000);
		
		// Calling printMessageWelcome()
		printMessageWelcome();
		//=======================================
		// Testing the code for class House functionality. 
		System.out.println("House H1: This House is type "+ H1.getTypeOfHouse() +". Its age is " +H1.getAge() + ". and costs " + H1.getCost());
		System.out.println("House H1: This House is type "+ H2.getTypeOfHouse() +". Its age is " +H2.getAge() + ". and costs " + H2.getCost());
		System.out.println("House H1: This House is type "+ H3.getTypeOfHouse() +". Its age is " +H3.getAge() + ". and costs " + H3.getCost());
		System.out.println("House H1: This House is type "+ H4.getTypeOfHouse() +". Its age is " +H4.getAge() + ". and costs " + H4.getCost());
		System.out.println();
		System.out.println("Accessor Method: The housetype for house H4 is "+ H4.getTypeOfHouse() +". Its age is" +H4.getAge() + ". and costs " + H4.getCost());
		System.out.println();
		System.out.println("The estimated price of house H3 is " + H3.estimatePrice(4, "Attached"));
		System.out.println("The estimated price of house H4 is " + H4.estimatePrice(2, "Detached"));
		System.out.println();
		//=======================================
		H3.setAge(5);
		H3.setTypeOfHouse("Semidetached");
		H3.setCost(240000);
		//=======================================
		System.out.println("Mutator Method: The new age for house H3 is " + H3.getAge());
		System.out.println("Mutator Method: Housetype for house H3 is " + H3.getTypeOfHouse());
		System.out.println("Mutator Method: The new cost for house H3 is " + H3.getCost());
		//=======================================
		H3.setAgeAndCost(6, 245000);
		System.out.println("Mutator Method: The new house H3 age is " + H3.getAge() + " and its new cost is " + H3.getCost());
		H3.setAgeTypeAndCost(14, "Semidetached", 260000);
		//=======================================
		System.out.println("Mutator Method: The new housetype for house H3 is " + H3.getTypeOfHouse() + ", its new age is " 
							+ H3.getAge() + " and its cost is " + H3.getCost());
		System.out.println();
		System.out.println("toString: " + H3);
		System.out.println();
		//=======================================
		System.out.println("Houses H1 and H2 are equal is " + H1.equals(H1));
		System.out.println("Houses H1 and H4 are equal is " + H1.equals(H4));
		System.out.println();
		System.out.println("House H4 is less than H3 is " + H4.isLessThan(H3));
		System.out.println("House H4 is greater than H3 is " + H4.isGreaterThan(H3));
		System.out.println("\n======================================================");
		System.out.println(" ****** Testing two more objects of type House *****");
		System.out.println("======================================================\n");
		System.out.println("House H5: This House is type "+ H5.getTypeOfHouse() +". Its age is " +H5.getAge() + ". and costs " + H5.getCost());
		System.out.println("House H6: This House is type "+ H6.getTypeOfHouse() +". Its age is " +H6.getAge() + ". and costs " + H6.getCost());
		//=======================================
		System.out.println();
		H5.setAgeAndCost(47, 130000);
		H5.setTypeOfHouse("Semidetached");
		H6.setAgeTypeAndCost(23, "Detached", 280000);
		//=======================================
		System.out.println();
		System.out.println("The estimated price of house H5 is " + H5.estimatePrice(47, "Semidetached"));
		System.out.println("The estimated price of house H6 is " + H6.estimatePrice(23, "Detached"));
		//=======================================
		System.out.println();
		System.out.println("toString: " + H5);
		System.out.println("toString: " + H6);
		System.out.println("Houses H5 and H6 are equal is " + H5.equals(H6));
		//=======================================
		System.out.println();
		System.out.println("House H5 is less than H6 is " + H5.isLessThan(H6));
		System.out.println("House H5 is greater than H6 is " + H5.isGreaterThan(H6));	
		System.out.println();
		System.out.println("======================================================");
		printExitMessage();
		
	}
	
	// Printing welcome message.
	private static void printMessageWelcome() {
		System.out.println("-------****-------****-------****-------****-----****-----\n"
				         + "|    Welcome to the program that testruns class House!   |\n"
				         + "-------****-------****-------****-------****-----****-----\n");
	}
	// Printing exist message.
	private static void printExitMessage() {
		System.out.println("\n ***** Thank you for testing Java class House *****");
	}
}