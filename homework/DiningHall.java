package homework;

public class DiningHall extends Locations { //Child class of Locations
	
	//It describes the Dining hall
	
	public DiningHall() {//calling parent constructor inside, creating sorting_hat object and food object, and character named Dumbledore and what he says
		super("The dining hall is the biggest open area inside Hogwarts.", new sorting_hat(),new food(), new characters("Dumbledore","Welcome to the dining hall! Interact with the sorting hat to be sorted"
						+ "into a house, then enjoy the food served in the hall."));
	}
	
	//prints the description of the dining hall and the character present in it
	public void look() {
		System.out.println(description+ character.name+" is in the hall to welcome new students.");
	}

}
