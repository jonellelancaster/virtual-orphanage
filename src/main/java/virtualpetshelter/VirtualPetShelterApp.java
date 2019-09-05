package virtualpetshelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetShelter LonelyHeartOrphanage = new VirtualPetShelter();

		LonelyHeartOrphanage.add(new VirtualBaby("Sally\t", "|She is calm, quiet, and loves to cuddle."));
		LonelyHeartOrphanage
				.add(new VirtualBaby("Quinton\t", "|He laughs all the time but, likes to get into trouble."));
		LonelyHeartOrphanage.add(new VirtualBaby("Jane\t", "|She is a badass that is avanced beyond her age."));
		LonelyHeartOrphanage.add(new VirtualBaby("Henry\t", "|Think Children Of The Corn. BEWARE"));
		LonelyHeartOrphanage.add(new VirtualBaby("Lucy\t", "|Always is dancing and singing"));

		System.out.println("Welcome to Lonely Hearts Orphanage. What is your name?");

		String nameofVisitor = input.nextLine();

		System.out.println("Hello " + nameofVisitor
				+ ".\nHere are our children that are needing a parent and a little about each of them.");

		for (VirtualBaby baby : LonelyHeartOrphanage.getTotalListofBabies()) {

			System.out.println("\tName:\t|Discription:\t");
			System.out.println(
					"----------------|------------------------------------------------------------------------");
			System.out.println("\t" + baby);

			System.out.println("\tHungry\t|Energy\t|Diaper\t|Teething|Play\n\t" + baby.getHungry() + "\t|"
					+ baby.getEnergy() + "\t|" + baby.getDiaper() + "\t|" + baby.getTeething() + "\t |"
					+ baby.getPlayTime() + "\n ");

		
		}
		userMenu();
		String menuChoice = input.nextLine();
		for (VirtualBaby baby: LonelyHeartOrphanage.getTotalListofBabies()) {
		if(menuChoice.equals("1")) {
			System.out.println("The babies are eating.");
			baby.feed();
			baby.tick();
			userMenu();
		
		}else if (menuChoice.equals("2")) {
			baby.changeDiaper();
			System.out.println("All the diapers have been changed.");
			baby.tick();
			userMenu();
		}else if (menuChoice.equals("3")) {
			baby.giveTeether();
			System.out.println("The babies are chewing on toys.");
			baby.tick();
			userMenu();
		}else if (menuChoice.equals("4")) {
			baby.playWithBaby();
			System.out.println("Babies are playing");
			baby.tick();
			userMenu();
		}else if (menuChoice.equals("5")) {
			System.out.println("Which baby would you like to take home?");
			String babyToBeAdopted = input.nextLine();
//			LonelyHeartOrphanage.adopt(VirtualBaby.equals(babyToBeAdopted));
//			LonelyHeartOrphanage.findBaby(babyToBeAdopted);
//			babyToBeAdopted = LonelyHeartOrphanage.adopt(babyToBeAdopted);
			baby.tick();
			userMenu();
		} else if (menuChoice.equals("6")) {
			System.out.println("What is the name of the baby?");
			String newBabyName= input.nextLine();
			System.out.println("Please provide a breif description of the child");
			String newBabyDescription= input.nextLine();
			LonelyHeartOrphanage.add( new VirtualBaby (newBabyName, newBabyDescription));
			baby.tick();
			userMenu();
		}else if (menuChoice.equals("7")) {
			System.out.println("\tName:\t|Discription:\t");
			System.out.println(
					"----------------|------------------------------------------------------------------------");
			System.out.println("\t" + baby);

			System.out.println("\tHungry\t|Energy\t|Diaper\t|Teething|Play\n\t" + baby.getHungry() + "\t|"
					+ baby.getEnergy() + "\t|" + baby.getDiaper() + "\t|" + baby.getTeething() + "\t |"
					+ baby.getPlayTime() + "\n ");
			baby.tick();
			userMenu();
		}else if (menuChoice.equals("8")) {
			System.out.println("Goodbye.");
			System.exit(0);
		}else {
			System.out.println("Enter a number 1-7");
			userMenu();
			
			
			
			
			
		}
			
		}	

}
	


	public static void userMenu() {
		System.out.println(
				"Now that you have seen all the wonderful children we have for sale, What would you like to do?");
		System.out.println("Press 1 to feed the children");
		System.out.println("Press 2 to change the children's diapers");
		System.out.println("Press 3 to give the children teething toys");
		System.out.println("Press 4 to Play with the children");
		System.out.println("Press 5 to adopt a child");
		System.out.println("Press 6 to leave a child you no longer want in our care");
		System.out.println("Press 7 to see the babies again");
		System.out.println("Press 8 if you are disgusted with children and need to leave");

	}
}
	