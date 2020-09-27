package homework;

import java.util.Scanner;

public class potion implements objects {//potion class implements objects
	public void use() {
		
		Scanner scan= new Scanner(System.in);
		//prints sample text
		System.out.println("Drink this, it is delicious, press any alphabet after you are done!");
		String message= scan.nextLine();
		//prints star pattern
		for (int i=1; i<5; i++) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("MAGIC!");
		
	}
	

}