package homework;

public class Library extends Locations{//Location #2 Library class
	public Library() {//constructor calls Locations class, instantiating a book, a quill and a character named hermione and what she says
		super("Once the academic year starts, students spend a lot of their time in the school library."
				, new book(),new quill(), new characters("Hermione","Welcome to the library! Read a book or"
						+ " write with a quill!"));
	}
	
	
	public void look() {//prints the description of the library and who is in it
		System.out.println(description+character.name +" is in the Library to talk to.");
	}
}