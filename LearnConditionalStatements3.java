package week1.day2;

public class LearnConditionalStatements3 {
	public static void main(String[] args) {
		String choice = "First Class";
		switch (choice) {
		case "Balcony":
			System.out.println("Ticket costs: Rs.250");
			break;
		case "First Class":
			System.out.println("Ticket costs: Rs.200");
			break;
		case "Third Class":
			System.out.println("Ticket costs: Rs.150");
			break;
		default:
			System.out.println("Please select the valid output");
			break;
		}
	}


}
