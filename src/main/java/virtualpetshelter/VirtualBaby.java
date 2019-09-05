package virtualpetshelter;

public class VirtualBaby {

	private int hungry = 50;
	private int energy = 50;
	private int diaper = 50;
	private int teething = 50;
	private int playTime = 50;
	private String babyName;
	private String description;

	public VirtualBaby(String babyName, String description) {
		this.babyName = babyName;
		this.description = description;
	}

	public String toString() {
		return babyName + "\t" + "|"+ description;
	}

	public int getHungry() {

		return hungry;

	}

	public int getEnergy() {
		return energy;
	}

	public int getDiaper() {
		return diaper;

	}

	public int getTeething() {
		return teething;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void feed() {
		hungry += 10;
		energy -= 1;
		diaper -= 1;
		teething -= 2;
		playTime -= 1;

		System.out.println(babyName+ " is eating.\n ");
	}

	public void sleep() {
		energy += 10;
		hungry -= 5;
		diaper -= 10;
		teething += 2;
		playTime -= 2;

		System.out.println("Babies are sleeping.\n ");
	}

	public void changeDiaper() {
		diaper += 10;
		energy += 2;
		playTime += 2;

		System.out.println("Babies are getting diapers changed.\n ");
	}

	public void tick() {
		hungry -= 2;
		energy -= 2;
		diaper -= 2;
		teething -= 2;
		playTime -= 2;
		System.out.println("tick");

	}

	public void giveTeether() {
		teething += 10;
		energy -= 2;
		hungry -= 1;
		System.out.println("Babies are chewing on toys.\n ");

	}
	
	

	public void playWithBaby() {
		playTime += 10;
		energy -= 5;
		System.out.println("Babies are playing.\n ");

	}

	public void drinkWine() {

	}

	public void declareDeath(){
	
		System.out.println("You killed your baby. You are a terrible person.");

	}

	public String getBabyName() {
		return babyName;
	}

	
	
}
