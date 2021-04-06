
public class Watch implements Runnable {
	int cycles;
	public Watch(int cycles) {
		
		this.cycles = cycles;
		Thread timerThread = new Thread(this);
		timerThread.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++)
			{try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //4x30s sleeps, fix syntax
			
			System.out.println("\n -- " + (i+1)*30 + " seconds have passed --\n");
			//TODO add Hermione attempt
			}
		
		
		///TODO Print out to hide mapm

		System.out.println("2 minutes passed \nYou have 10 seconds to leave!\n");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //10 second sleep
		
		//Bad end without mischief managed
		//TODO Add bad end screen
		//Since Mischief managed already exits the game, it would mean it either managed the mischief, or fails and exits here, never both (unless the timer runs out during the execution of the art in the mischief managed block)
		System.out.println("You've been caught!");
		System.exit(2);
		
		//Out of loop
	}

	//TODO Add thread logic
	
	
	

	

}
