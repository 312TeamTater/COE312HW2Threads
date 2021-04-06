import java.util.Scanner;

public class Player implements Runnable {

	//Great Hall up
	//HeadOffice right
	//Library left
	//A better method would be to have an id for each location, but we realised too late
	int locationid = 0; //0 = start, 1 = Great Hall, 2 = Headoffice, 3 = library. should be enum
	Location[] position = new Location[4]; //uses locationid for the specific
	int[] headOfficePwd;

	
	Player(int[] pwdArr)
	{
		//Headmaster's office's password
		headOfficePwd = pwdArr;
		position[1] = new GreatHall();
		position[2] = new HeadOffice();
		
		//Passing the password object to hermione
		position[3] = new Library(pwdArr);
		
	
		
		Thread pThread = new Thread(this);
		pThread.start();
		
	}
	
	
		
	
	//Lookaround mechanic
	void lookaround()  
	{
		switch(locationid)
		{
		case 0: System.out.println("south is the entrance, north is the super great hall, east is the Headmaster's office, west is the library  "); 
		break;
		default: System.out.println("You are in the " + position[locationid].locationName
				+ " you can see a \n");
		position[locationid].getItems();
		System.out.println( "Scattered around. "
				+ "You can also see \n");
		position[locationid].getChars();
		System.out.println("Standing around\n"
				+ "You can also go back " + position[locationid].cameFrom + " to leave the room\n" );
		}
			
	}
	//Interactions, useitem and talk to are the same, but for different types (NPC vs Item)
	void useItem(String itemName)
	{
		boolean itemfound = false;
		for (int i = 0; i < position[locationid].items.length;i++)
		{
			if (position[locationid].items[i].itemName().toLowerCase().equals(itemName.toLowerCase()))		//Case insensitive, much less efficient than case sensitive
				{System.out.println(position[locationid].items[i].use());	itemfound = true;	}
				
		}
		if (!itemfound)
			System.out.println("\n" + itemName + " not found in " + position[locationid].locationName + "- check correct spelling - \n");
	}
	
	void talkTo(String npcName)
	{
		boolean charfound = false;
		for (int i = 0; i < position[locationid].chars.length; i++)
		{
			if (position[locationid].chars[i].characterName().toLowerCase().equals(npcName.toLowerCase())) //Extremely similar to useItem
				{System.out.println(position[locationid].chars[i].talk()); 	charfound = true;}
				
		}
		if (!charfound)
			System.out.println("\n" + npcName + " not found in " + position[locationid].locationName + " - check correct spelling - \n");
	}
	
	//Movement mechanics
	boolean Move(String direction)
	{
		switch (locationid) 
		{
		//Specific cases for each room, so leave or go a specific direction
		case 1://hall
			switch(direction) 
			{
			case "down":case "south":case "back": locationid = 0;System.out.println("\nMoved out of the great hall into the intersection (The Entrance)\n"); 
				return true; //TODO change to proper names of locations
			}
		
		case 2: //head 
		{
			switch(direction) 
			{
			case "left":case "west":case "back": locationid = 0; System.out.println("\nLeft the headmaster's office, you're now at the intersection (The Entrance)\n");
				return true; 
			}
			break;//Breaks out of the location case marking an invalid direction, only happens if in the area
			}
			//Library
		case 3:
			switch(direction) 
			{
			case "right":case "east": case "back": locationid = 0; System.out.println("\nLeft the Library, you're now at the intersection (The Entrance)\n");
				return true; 
			}
			break;
			//If in the starting area, and if locationid horribly breaks it'll take you back to the starting area as this is the default
		case 0: default:
				switch(direction)
				{
			//	case "down":case "south": break; //no such room
				case "up":case "north": locationid = 1;System.out.println("\nYou walked into the Great Hall\n");
				return true;
				case "left":case "west": locationid = 3; System.out.println("\nYou walked into the Library\n");
				return true; 
				
				case "right":case "east":  
				//TODO add password logic INPUt
				
		
				System.out.println("Input the 5 digit passwrod to the Headmaster's Office");
				if (checkPwd())
					{	
					locationid = 2;
					System.out.println("\nYou walked into the Headmaster's office\n");
					return true; 
					}
				else {
					System.out.println("You can't go into the Headmaster's Office with that password");
					return false;
				}
				 //TODO add flavour text after completion
				}
		}
		
		System.out.println("\nCan't move to " + direction + " direction\n");
		return false; //Failed move
		
	}

	//Asks for a password and checks if it's the correct one
	synchronized boolean checkPwd()
	{
		int inPwd[] = new int[5];
		Scanner userInput = new Scanner(System.in);
		for (int i =0; i<5; i++)
		{ 
			inPwd[i] = userInput.nextInt();
		}
		for(int k = 0; k < inPwd.length;k++)
		{
			
		if (inPwd[k] != headOfficePwd[k] )
			return false;
		}
		return true;
	}
	@Override
	public void run() {
	}
	
}