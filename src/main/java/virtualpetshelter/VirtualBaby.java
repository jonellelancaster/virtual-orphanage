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
		return babyName + description;
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

		System.out.println("Baby is eating");
	}

	public void sleep() {
		energy += 10;
		hungry -= 5;
		diaper -= 10;
		teething += 2;
		playTime -= 2;

		System.out.println("Baby is sleeping.");
	}

	public void changeDiaper() {
		diaper += 10;
		energy += 2;
		playTime += 2;

		System.out.println("Baby is getting diaper changed.");
	}

	public void tick() {
		hungry -= 2;
		energy -= 2;
		diaper -= 2;
		teething -= 2;
		playTime -= 2;

	}

	public void giveTeether() {
		teething += 10;
		energy -= 2;
		hungry -= 1;

	}

	public void playWithBaby() {
		playTime += 10;
		energy -= 5;

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
