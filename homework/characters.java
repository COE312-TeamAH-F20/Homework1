package homework;

public class characters { // normal characters class which can be instantiated to make different character objects
	String name;
	String says; // what is the person going to say?
	
	public characters(String name,String S) {//constructor
		this.name= name;
		says=S;
	}
	public void talk () { //prints what the character object talks, code word 'talk to <Name>'
		System.out.println(says);
	}
}
