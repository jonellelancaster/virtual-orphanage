package virtualpetshelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	static VirtualPetShelter lonelyHeartOrphanage = new VirtualPetShelter();

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		lonelyHeartOrphanage.add(new VirtualBaby("Sally", "She is calm, quiet, and loves to cuddle."));
		lonelyHeartOrphanage.add(new VirtualBaby("Quinton", "He laughs all the time but, likes to get into trouble."));
		lonelyHeartOrphanage.add(new VirtualBaby("Jane", "She is a badass that is avanced beyond her age."));
		lonelyHeartOrphanage.add(new VirtualBaby("Henry", "Think Children Of The Corn. BEWARE"));
		lonelyHeartOrphanage.add(new VirtualBaby("Lucy", "Always is dancing and singing"));

		System.out.println("Welcome to Lonely Hearts Orphanage. What is your name?");

		String nameofVisitor = input.nextLine();

		System.out.println("Hello " + nameofVisitor + "! What would you like to do?");

		userMenu();

		while (true) {

			String menuChoice = input.nextLine();

			if (menuChoice.equals("1")) {
				lonelyHeartOrphanage.feedAllBabies();
				userMenu();
				lonelyHeartOrphanage.tickForAllBabies();

			} else if (menuChoice.equals("2")) {
				lonelyHeartOrphanage.changeAllTheBabiesDiapers();
				userMenu();
				lonelyHeartOrphanage.tickForAllBabies();

			} else if (menuChoice.equals("3")) {
				lonelyHeartOrphanage.giveAllBabiesDrink();
				userMenu();
				lonelyHeartOrphanage.tickForAllBabies();

			} else if (menuChoice.equals("4")) {
				System.out.println("Which baby would you like to play with?");
				System.out.println(lonelyHeartOrphanage.getTotalListofBabies());
				String babyNameToBePlayedWith = input.nextLine();
				if (lonelyHeartOrphanage.canPLayWithBaby(babyNameToBePlayedWith)) {
					VirtualBaby babyToBePlayedWith = lonelyHeartOrphanage.findBaby(babyNameToBePlayedWith);
					lonelyHeartOrphanage.playWithBaby(babyToBePlayedWith);
					userMenu();
					lonelyHeartOrphanage.tickForAllBabies();
				} else {
					System.out.println("Please choose a baby within our care.");
					userMenu();
					lonelyHeartOrphanage.tickForAllBabies();
				}

			} else if (menuChoice.equals("5")) {
				System.out.println("Which baby would you like to take home?");
				String babyNameToBeAdopted = input.nextLine();

				if (lonelyHeartOrphanage.isBabyAdoptable(babyNameToBeAdopted)) {
					VirtualBaby babyToBeAdopted = lonelyHeartOrphanage.findBaby(babyNameToBeAdopted);
					lonelyHeartOrphanage.adopt(babyToBeAdopted);
					System.out.println("Thank you for your purchase of " + babyToBeAdopted.getBabyName());
					userMenu();
					lonelyHeartOrphanage.tickForAllBabies();
				} else {
					System.out.println("Please choose a baby within our care.");
					userMenu();
					lonelyHeartOrphanage.tickForAllBabies();
				}

			} else if (menuChoice.equals("6")) {
				System.out.println("What is the name of the baby?");
				String newBabyName = input.nextLine();
				System.out.println("Please provide a breif description of the child");
				String newBabyDescription = input.nextLine();
				lonelyHeartOrphanage.add(new VirtualBaby(newBabyName, newBabyDescription));
				userMenu();
				lonelyHeartOrphanage.tickForAllBabies();
				lonelyHeartOrphanage.getTotalListofBabies();

			} else if (menuChoice.equals("7")) {

				System.out.println("\tName:\tDiscription:\t");
				System.out.println(
						"----------------------------------------------------------------------------------------");
				for (VirtualBaby baby : lonelyHeartOrphanage.getTotalListofBabies()) {
					System.out.println("\t" + baby);
					System.out.println("\tHungry\t|Energy\t|Diaper\t|Teething|Play\n\t" + baby.getHungry() + "\t|"
							+ baby.getEnergy() + "\t|" + baby.getDiaper() + "\t|" + baby.getThirst() + "\t |"
							+ baby.getPlayTime() + "\n ");
				}
				userMenu();
				lonelyHeartOrphanage.tickForAllBabies();
			} else if (menuChoice.equals("8")) {
				System.out.println("Goodbye.");
				System.exit(0);

			} else {
				System.out.println("Enter a number 1-7");
				userMenu();

			}

		}

	}

	public static void userMenu() {

		System.out.println("Press 1 to feed the children");
		System.out.println("Press 2 to change the children's diapers");
		System.out.println("Press 3 to give the children teething toys");
		System.out.println("Press 4 to Play with the children");
		System.out.println("Press 5 to adopt a child");
		System.out.println("Press 6 to leave a child you no longer want in our care");
		System.out.println("Press 7 to see the babies available for adoption and a little about them");
		System.out.println("Press 8 if you are disgusted with children and need to leave");

	}
}
