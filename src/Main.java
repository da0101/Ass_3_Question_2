
public class Main {

	public static void main(String[] args) {
		House H1  = new House(1950, 100000);
		House H2  = new House(1950, 100000);
		House H3  = new House(4, 120000);
		House H4  = new House(2, "detached", 220000);
		printAccessors(H3, "H3");
		System.out.println(H3.estimatePrice(4, "Attached"));
		System.out.println(H4.estimatePrice(2, "detached"));
		System.out.println(H1.estimatePrice(1950, "Attached"));
		//System.out.println("The new age for house H3 is " + );
		
		H3.setAge(5);
		System.out.println("The new age for house H3 is " + H3.getAge());
		System.out.println(H1);
		
	}
	
	
	private static void printAccessors(House h, String s) {
		System.out.println("The housetype for house " + s + " is " + h.getTypeOfHouse() + " its age is " + h.getAge() +  " and it costs $" + h.getCost());
	}	

}
