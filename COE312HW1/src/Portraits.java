import java.util.Random;


public class Portraits implements Item {
	
	Random rnd = new Random(); // gives a random seed	
	
	public String itemName() {
		return "Portraits";
	}

	//generates random advice or information
	public String use()
	{
		switch(rnd.nextInt(4))
		{
		case 0: return "\nAdvice: It does not do well to dwell on dreams and forget to live.\n";
		case 1: return "\nInfo: The Marauder's Map is a magical document that reveals\n all of Hogwarts School of Witchcraft and Wizardry!\n";
		case 2: return "\nAdvice: It takes a great deal of bravery to stand up to\n our enemies, but just as much to stand up to our friends\n";
		case 3: return "\nInfo: The magical governments of the world are united\n in the International Confederation of Wizards\n";
		}
		return "Error"; //Should never be the case
		
	}

	
}