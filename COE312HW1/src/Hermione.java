import java.util.Random;

public class Hermione implements NonPlayerCharacter, Runnable{
	//Watch timerWatch;
	boolean interactedWith = false;
	boolean passwordFound = false;
	int[] pwdArr;
	
	public Hermione(int[] headOfficePwd) {
		super();
		//this.timerWatch = timerWatch;
		Thread hermThread = new Thread(this);
		hermThread.start();
		
		//Pass a shared array to use as the password for the office
		pwdArr = headOfficePwd;
		
	}
	public String characterName() {
		return "Hermione";
	}
	public String talk() {
		interactedWith = true;
		//TODO Change talk text password related
		return "\nHermione: Generating the password!\n";
		
	}
	
	
	synchronized public void generatePwd() {
		
		int bound = 101;
		
		Random rnd = new Random();
		int[] rndArr = new int[5];
		int sumrnd = 0;
		for (int i = 0; i<5;i++)
		{
			rndArr[i]= rnd.nextInt(bound);
			bound = bound - rndArr[i];
			sumrnd+=rndArr[i];
		}

		if(sumrnd == 100)
		{ 
			System.out.println("The password to the headmaster's office is!");
			for (int i = 0;i<rndArr.length; i++)
				{
				pwdArr[i] = rndArr[i]; 
				System.out.print(rndArr[i]+ "\t");

				}
			passwordFound = true;
		
			System.out.println("\n\n Quick! leave the library!\n"
					+ "To move, type 'walk [direction]' \n");
			//Correct password logic
		}
		else 
			System.out.println("Got it wrong.. I'm trying again..");

	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 99999; i++)
		{try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //4x30s sleeps, fix syntax
		
		if (interactedWith && !passwordFound)
			generatePwd();
		}
	}
	}
