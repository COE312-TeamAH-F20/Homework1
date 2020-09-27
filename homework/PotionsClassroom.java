package homework;

public class PotionsClassroom extends Locations {//Location #3 Potions class, child class of abstract class Locations
	public PotionsClassroom() {//calls constructor of Locations, passes new object of cauldron, potion and a character named Snape
		super("Potions is one of the core subjects that first year students are required to study",
				new cauldron(),new potion(), new characters("Snape","I don't care if you are here for not, but you can use the cauldron to make a potion"
						+ "or drink the potion to cast a spell."));
	}
	
	public void look() {//print description of potions class and the character in it
		System.out.println(description+character.name +" is in the potions class to talk.");
	}
}
