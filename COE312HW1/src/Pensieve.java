
public class Pensieve implements Item {
	
	public String itemName() {
		return "Pensieve";
	}
	
	public String use() {
		return ""
				+ "            *          .\n"
				+ "                   *       '\n"
				+ "              *                *\n"
				+ "\n"
				+ ""
				+ "\nYou're now reviewing memories..\n\n"
				+ ""
				+ "  *   '*\n"
				+ "           *\n"
				+ "                *\n"
				+ "                       *\n"
				+ "               *\n"
				+ "                     *";
	}	
	
}