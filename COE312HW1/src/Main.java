import java.util.Scanner;

//Main, also userinterface
public abstract class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("                                         _ __\n"
				+ "        ___                             | '  \\\n"
				+ "   ___  \\ /  ___         ,'\\_           | .-. \\        /|\n"
				+ "   \\ /  | |,'__ \\  ,'\\_  |   \\          | | | |      ,' |_   /|\n"
				+ " _ | |  | |\\/  \\ \\ |   \\ | |\\_|    _    | |_| |   _ '-. .-',' |_   _\n"
				+ "// | |  | |____| | | |\\_|| |__    //    |     | ,'_`. | | '-. .-',' `. ,'\\_\n"
				+ "\\\\_| |_,' .-, _  | | |   | |\\ \\  //    .| |\\_/ | / \\ || |   | | / |\\  \\|   \\\n"
				+ " `-. .-'| |/ / | | | |   | | \\ \\//     |  |    | | | || |   | | | |_\\ || |\\_|\n"
				+ "   | |  | || \\_| | | |   /_\\  \\ /      | |`    | | | || |   | | | .---'| |\n"
				+ "   | |  | |\\___,_\\ /_\\ _      //       | |     | \\_/ || |   | | | |  /\\| |\n"
				+ "   /_\\  | |           //_____//       .||`      `._,' | |   | | \\ `-' /| |\n"
				+ "        /_\\           `------'        \\ |           `.\\  | |  `._,' /_\\\n"
				+ "                                       \\|                 `.\\"
				+ ""
				+ "\n\n \t\t--A game created by Motasem and Ali--"
				+ "\n\n\n"
				+ "Messrs Moony, Wormtail, Padfoot and Prongs Purveyors of Aids to\n"
				+ "magical Mischief-Makers are proud to present THE MARAUDER'S MAP\n"
				+ "Say the magic phrase to reveal the map.\n\n"
				+ "To exit the game, type 'mischief managed'\n\n");
	
	
		int[] pwdArr = new int[5];
		Player player = new Player(pwdArr); //It would be of a class main character which extends movement. but also can interact with things
		//here
		String action, dest;
		boolean pwd = false;
		String Password = userInput.nextLine();
	
		while(!pwd)
		{
			switch (Password.toLowerCase()) //To lower to keep it case insensitive (WHICH PASSWORDS SHOULD ALWAYS BE CASE SENSITIVE)
			{
			
			 case "i solemnly swear that i am up for no good": case "up up down down left right left right b a": case "test": //Small easter egg
				pwd = true; Watch timer = new Watch(0); break;
			case "mischief managed": 
				System.out.println("Thank you for playing our extremely accurate game of Harry Potter, made by two people who definitely watched all the movies and read\n"
				+ "Hiding the map, \nTHE END"); userInput.close();  System.exit(0); //No need for break as it terminates. Only one userinput as there is no need to distinguish between the first and second words
			default:
			System.out.println("Wrong Password");
			Password = userInput.nextLine();
			//failed attempt, try again
			//Input stuff
			
			}
		};
		
		

		System.out.println(""
				+ ""
				+ "\n"
				+ "     \n The Marauder's Map: \n"
				+ "                           ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▀▀▄▄▄▄▄▄▀▀▀▄\n"
				+ "                          ▀                                 ▀▄\n"
				+ "                     ▄▄▄▀▀               North                 ▀▄\n"
				+ "                 ▄▀                 The Great Hall                ▀▄▄\n"
				+ "            ▄▄▀                         ▄▄▄▄▄▄▄                        ▀▄\n"
				+ "            █                          ▓       ▌                         ▄▀\n"
				+ "           ▌                           ▓       ▌                         ▌\n"
				+ "           ▐                           ▓       ▌                         ▌\n"
				+ "           ▓              West         ▓▄▄▄▄▄▄▓            East         ▌\n"
				+ "           █            Library                    Headmasters Office    ▀\n"
				+ "           ▓            ▄▄▄▄▄▄                            ▄▄▄▄▄▄          ▐▀\n"
				+ "           ▌           ▓      █                          ▓      █         ▐\n"
				+ "           ▓           ▓      ▓                          ▓      ▓          ▀▄\n"
				+ "           ▄           ▓      ▓     <you are here>       ▓      ▓            ▌\n"
				+ "           █           ▓      ▓      The Entrance        ▓      ▓             ▓\n"
				+ "           ▓           ▓▄▄▄▄▄▄▓                          ▀▀▀▀▀▀▀▀            ▌\n"
				+ "           ▐                                                                ▌\n"
				+ "          ▄                                                                ▓\n"
				+ "           ▀▀                                                             ▓\n"
				+ "              ▀▀▄   ▄▄▄▄▄▄▄▄                      ▄▄▄▄▄▄▄▄▄▄▄▄▄    ▄▀▀▀▀▀\n"
				+ "                 ▀▀▀        ▀▄     ▄▀▐▄▄▀▀▀▀▀▀▀▀▀▀              ▀▀▀\n"
				+ "                               ▀▀\n"
				+ "     \n"
				+ "     \n"
				+ "    "
				+ ""
				+ ""
				+ ""
				+ ""
				+ "The Entrance\n"
				+ "You arrive at the doors of Hogwarts. The door on the north wall leads to\n"
				+ "the great hall, the door to the east leads to the Headmaster’s office\n"
				+ "and the door to the west leads to the Library.\n");
		while(true)
		{
		
		System.out.println("What will you do?\n"
				+ "To move, type 'walk [direction]',\n"
				+ "to use an item, type 'use [item]',\n"
				+ "to talk to someone, type 'talk [character]'\n"
				+ "to look around, type 'look' or 'lookaround' to find the exact spelling of interactable objects"
				+ "\n");
		action = userInput.next();
		
		
		//All of them but the exit calls upon the player class, which has all the logic
		switch(action)
		{
		//Simple cases of 
		case "move": case "walk": case "go":
			dest = userInput.next();
			player.Move(dest);
			break;
		case "use":
			dest = userInput.next();
			player.useItem(dest);
			break;
		case "talk":
			dest = userInput.next(); //Needs the redundancy due to "look" needing to work for  player convenience
			player.talkTo(dest);
			break;
		case "look": case "lookaround":
			player.lookaround();		
			break;
		case "mischief": dest = userInput.next(); //If the if statement failed, it's a wrong password and it goes to default. It also allows two words to be input to exit (mischief managed)
			//There is a slight bug where if someone puts "mischief managed *" as input, it would still exit the game, but the keywords are there
			if (dest.equals("managed")){System.out.println("Thank you for playing!\n"
				+ "Hiding the map, \nTHE END"); userInput.close(); System.exit(0);}
		default:
			System.out.println("Wrong Input!"); //
		}
		
		}
		
			

	}

}
