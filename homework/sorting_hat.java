package homework;

import java.util.Random;

public class sorting_hat implements objects{//sorting hat class implementing objects interface
	public void use() {
		//Generates random number between 0 and 4
		Random r= new Random();
		int num= r.nextInt(4);
		//uses random number to get a house from the array
		String[] houses= {"Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"};
		//prinst generated house
		System.out.println(houses[num]);
	}
}
