package homework;

public abstract class Locations {//Abstract class locations to use the dining, library, potions class
	
	String description; //description of the location
	objects object1; //first object, references objects
	objects object2; //second object, references objects
	characters character; //character object of class character
	
	public Locations() { 
		super();
	}
	//user defined constructor
	public Locations(String des, objects obj1, objects obj2,characters charac) {
		description=des;
		object1= obj1;
		object2= obj2;
		character= charac;
	}
	abstract public void look(); //abstract function for location description and character present
		
	

	
}
