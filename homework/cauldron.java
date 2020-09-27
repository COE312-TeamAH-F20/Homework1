package homework;
import java.util.*;
public class cauldron implements objects { //cauldron is an object implementing interface object that makes a potion
	public void use() {
		//User input for name
		Scanner scan= new Scanner(System.in);
		System.out.println("What is the name of the potion you want to make?");
		String potion_name= scan.nextLine();
		//User input for ingredients
		System.out.println("Wow, that sounds fancy. What main ingredient, I recommend tears?");
		String ingredients= scan.nextLine();
		//printing the input details
		System.out.println("Hmm, looks like your potion, "+ potion_name+ " with "+ ingredients+ " is ready!");
		//code word- 'use cauldron'
	}
}
