package virtualorphanage;

public class VirtualBaby {

	private int hungry = 50;
	private int energy = 50;
	private int diaper = 50;
	private int thirst = 50;
	private int playTime = 50;
	private String babyName;
	private String description;

	public VirtualBaby(String babyName, String description) {
		this.babyName = babyName;
		this.description = description;
	}

	public String toString() {
		return babyName + ":\t" + ""+ description;
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

	public int getThirst() {
		return thirst;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void feed() {
		hungry += 10;
		energy -= 1;
		diaper -= 1;
		thirst -= 2;
		playTime -= 1;

		System.out.println(babyName+ " is eating.\n ");
	}

	public void sleep() {
		energy += 10;
		hungry -= 5;
		diaper -= 10;
		thirst += 2;
		playTime -= 2;

		System.out.println( babyName+" is sleeping.\n ");
	}

	public void changeDiaper() {
		diaper += 10;
		energy += 2;
		playTime += 2;

		System.out.println(babyName+" is getting their diaper changed.\n ");
	}

	public void tick() {
		hungry -= 2;// this.hungry=this.huger-=2; would provide hunger at this time. will be needed for static class
		energy -= 2;
		diaper -= 2;
		thirst -= 2;
		playTime -= 2;
		

	}

	public void giveDrink() {
		thirst += 10;
		energy -= 2;
		hungry -= 1;
		System.out.println(babyName +" is having a drink\n ");

	}
	
	

	public void playWithBaby() {
		playTime += 10;
		energy -= 5;
		System.out.println( babyName+ " is playing.\n ");

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
