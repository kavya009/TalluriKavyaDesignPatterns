package behaviouralPattern_Mediator;

public class Mediator_Example {
	 public static void main(String[] args) {
	        Users Enzo = new Users("Enzo");
	        Users Jermey = new Users("Jermey");
	        
	        Enzo.sendMessage("Hi Jermey! How are you?");
	        Jermey.sendMessage("I'm great! Thanks for asking. How are you?");
	    }

}
