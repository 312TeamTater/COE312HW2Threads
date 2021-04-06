
public class GreatHall extends Location {

	
	public GreatHall() {
		super();
			//Initialise items and characters  in the great hall
		items[0] = new SortingHat();
		items[1] = new Food();
		chars[0] = new McGonagall();
		locationName = "Great Hall";
		//Used to know where you came from, not needed in this specific game as it can be hardcoded with the game's conditions, but helps in future expansion
		cameFrom = "south";
	} //North



}
