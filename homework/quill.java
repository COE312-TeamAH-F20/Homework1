package homework;
import java.util.*;
public class quill implements objects{//quill class implementing objects class
	public void use() {
		
		Scanner scan= new Scanner(System.in);
		//Input what is to be written
		System.out.println("Behold the magic quill! What do you want to write with it? Choose your words wisely :)");
		String message= scan.nextLine();
		//Output what is to be written
		System.out.println(message);
		System.out.println("Congratulations on writing with the quill!");
		
		
	}
	
}
