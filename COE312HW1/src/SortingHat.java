import java.util.Random;

public class SortingHat implements Item {

	Random rnd = new Random(); //already gives a random seed	
	
	public String itemName() {
		return "SortingHat";
	}
	
	//Generates random result for the chosen house
	public String use()
	{
		switch(rnd.nextInt(4))
		{
		case 0: return "\nYou've been chosen to be a Gryffindor!\n";
		case 1: return "\nYou've been chosen to be a Hufflepuff!\n";
		case 2: return "\nYou've been chosen to be a Ravenclaw!\n";
		case 3: return "\nYou've been chosen to be a Slytherin!\n";
		}
		return "Error"; //Should never be the case
		
	}
	
	
}
