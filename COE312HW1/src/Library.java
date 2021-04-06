
public class Library extends Location { //West/3

	public Library(int[] headOfficePwd) {
		super();
		//Initialise items and characters  in the Library
		items[0] = new Quill();
		items[1] = new Books();
		chars[0] = new Hermione(headOfficePwd);
		locationName = "Library";
		cameFrom = "East"; //See great hall's comment
	} 

}
