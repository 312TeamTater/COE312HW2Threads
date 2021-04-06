
public class HeadOffice extends Location {  //East/2

	
	public HeadOffice() {
		super();
		//Set the array variables to the Head Office's variables
		items[0] = new Portraits();
		items[1] = new Pensieve();
		chars[0] = new Dumbledore();
		locationName = "Headmaster's Office";
		cameFrom = "West"; //See Great Hall
	} 
	//Outdated text, only kept as a draft
//	Portraits portrait = new Portraits();
//	Pensieve pensieve = new Pensieve();
//	
//	
//	public void itemList()
//	{
//		System.out.println("In the headmaster's office, you find some portraits and a pensive");
//	}
}
