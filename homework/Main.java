package homework;
import java.util.*;
public class Main {
	/* Instructions
	 To walk north, type walk north, etc.
	 To look around, type look around
	 To talk to someone, type talk to <Name> which first letter capital
	 To use an object (any object), type use object, eg. use book, use food
	 To exit, type mischief managed
	 When in a room and want to go back to entrance, type go back
	  */
	public static void main (String args[]) {
		
		Scanner in= new Scanner(System.in);
		System.out.println("“Messrs Moony, Wormtail, Padfoot and Prongs Purveyors of Aids to\n" + 
				"magical Mischief-Makers are proud to present THE MARAUDER'S MAP”\n" + 
				"Say the magic phrase to reveal the map.");
		//Text input for game
		String code=in.nextLine();
		//This loop continues until the player enters the right slogan
		while (!code.equals("I solemnly swear that I am up for no good")) {
			System.out.println("That is not correct, Try again!");
			code= in.nextLine();
		}
		//String for entrance description
		String intro= "The Entrance\n" + 
				"You arrive at the doors of Hogwarts. The door on the north wall leads to\n" + 
				"the dining hall, the door to the east leads to the Potions class, and\n" + 
				"the door to the west leads to the Library. Type 'go back' to go back to entrance.";
		//description when someone walks north, east, west
		String line= "You have entered the ";
		//creating objects of major classes Dining Hall, Library and Potions Classroom
		DiningHall dining_hall= new DiningHall();
		Library library = new Library();
		PotionsClassroom potion_class= new PotionsClassroom();
		System.out.println(intro);
		//Game actually starts, loop exits when mischeif handled
		while (true) {
			//Text input
			String act= in.nextLine();
			if(act.equals("walk north")){
				System.out.println(line+ "dining hall.");
				while(true) {
					
					act= in.nextLine();
					if(act.equals("look around")) {
						dining_hall.look();
					}
					else if( act.contains("talk to")) {
						if (act.equals("talk to Dumbledore")) {
							dining_hall.character.talk();
						}
						else {
							System.out.println("This character is not in the room...try again.");
							
						}
					}
					else if(act.contains("use")){
						if(act.equals("use sorting hat")) {
							dining_hall.object1.use();
						}
						else if (act.equals("use food")){
							dining_hall.object2.use();
						}
						else{
							System.out.println("This object is not in the room...try again.");
							
						}
							
					}
					else if (act.equals("mischief managed") || act.equals("go back")) {
						break;
					}
					else
						System.out.println("Invalid command. Try again!");
				}
			}
			else if (act.equals("walk west")) {
				System.out.println(line+ "library.");
				while(true) {
					
					act= in.nextLine();
					if(act.equals("look around")) {
						library.look();
					}
					else if( act.contains("talk to")) {
						if (act.equals("talk to Hermione")) {
							library.character.talk();
						}
						else {
							System.out.println("This character is not in the room...try again.");
							
						}
					}
					else if(act.contains("use")){
						if(act.equals("use book")) {
							library.object1.use();
						}
						else if(act.equals("use quill")){
							library.object2.use();
						}
						else{
							System.out.println("This object is not in the room...try again.");
							
						}
							
					}
					else if (act.equals("mischief managed") || act.equals("go back")) {
						break;
					}
					else
						System.out.println("Invalid command. Try again!");
				}
			}
			else if (act.equals("walk east")) {
				System.out.println(line+ "Potions Classroom.");
				while(true) {
					
					act= in.nextLine();
					if(act.equals("look around")) {
						potion_class.look();
					}
					else if( act.contains("talk to")) {
						if (act.equals("talk to Snape")) {
							potion_class.character.talk();
						}
						else {
							System.out.println("This character is not in the room...try again.");
							
						}
					}
					else if(act.contains("use")){
						if(act.equals("use cauldron")) {
							potion_class.object1.use();
						}
						else if(act.equals("use potion")){
							potion_class.object2.use();
						}
						else{
							System.out.println("This object is not in the room...try again.");
							
						}
							
					}
					else if (act.equals("mischief managed") || act.equals("go back")) {
						break;
					}
					else
						System.out.println("Invalid command. Try again!");
				}
			}
			else if(act.equals("mischief managed")) {
				System.out.println("Thank you for playing the game!");
				break;
			}
			
			else {
				System.out.println("Invalid command. try again!");
			}
			if (act.equals("mischief managed")){
				System.out.println("Thank you for playing the game!");
				break;
			}
			else if (act.equals("go back")) {
				System.out.println(intro);
			}
			else
				continue;
		}
		
		
		
		
	}
}