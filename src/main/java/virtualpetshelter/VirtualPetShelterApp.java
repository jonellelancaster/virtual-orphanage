package virtualpetshelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	static VirtualPetShelter lonelyHeartOrphanage = new VirtualPetShelter();

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		lonelyHeartOrphanage.add(new VirtualBaby("Sally\t", "|She is calm, quiet, and loves to cuddle."));
		lonelyHeartOrphanage.add(new VirtualBaby("Quinton\t", "|He laughs all the time but, likes to get into trouble."));
		lonelyHeartOrphanage.add(new VirtualBaby("Jane\t", "|She is a badass that is avanced beyond her age."));
		lonelyHeartOrphanage.add(new VirtualBaby("Henry\t", "|Think Children Of The Corn. BEWARE"));
		lonelyHeartOrphanage.add(new VirtualBaby("Lucy\t", "|Always is dancing and singing"));

		System.out.println("Welcome to Lonely Hearts Orphanage. What is your name?");
		
		

		String nameofVisitor = input.nextLine();

		System.out.println("Hello " + nameofVisitor + "! What would you like to do?");

		userMenu();
		
		for (VirtualBaby babies : lonelyHeartOrphanage.getTotalListofBabies()) {

			String menuChoice = input.nextLine();
			
		
			if (menuChoice.equals("1")) {
				
//				lonelyHeartOrphanage.getTotalListofBabies().forEach(VirtualBaby -> babies.feed());// why is sally eating 5x																				
//				babies.feed(); // why is sally the only one eating?
				lonelyHeartOrphanage.tick(babies);
				userMenu();
				

			} else if (menuChoice.equals("2")) {
				babies.changeDiaper();
				userMenu();

			} else if (menuChoice.equals("3")) {
				babies.giveTeether();
				userMenu();

			} else if (menuChoice.equals("4")) {
				babies.playWithBaby();
				userMenu();

			} else if (menuChoice.equals("5")) {
				System.out.println("Which baby would you like to take home?");
				String babyToBeAdopted = input.nextLine();
				if(babyToBeAdopted.equalsIgnoreCase(babies.getBabyName())) {
				VirtualBaby babyName= lonelyHeartOrphanage.findBaby(babyToBeAdopted);
					lonelyHeartOrphanage.adopt(babyName);
				userMenu();
				}else {
				System.out.println("please choose a baby within our care.");
				userMenu();}
			
//				lonelyHeartOrphanage.adopt(lonelyHeartOrphanage.findBaby(babyToBeAdopted));
				userMenu();

			} else if (menuChoice.equals("6")) {
				System.out.println("What is the name of the baby?");
				String newBabyName = input.nextLine();
				System.out.println("Please provide a breif description of the child");
				String newBabyDescription = input.nextLine();
				lonelyHeartOrphanage.add(new VirtualBaby( newBabyName, newBabyDescription));
				userMenu();
				lonelyHeartOrphanage.getTotalListofBabies();

			} else if (menuChoice.equals("7")) {
				System.out.println("\tName:\t|Discription:\t");
				System.out.println(
						"----------------|------------------------------------------------------------------------");
				System.out.println("\t" + babies);
				System.out.println("\tHungry\t|Energy\t|Diaper\t|Teething|Play\n\t" + babies.getHungry() + "\t|"
						+ babies.getEnergy() + "\t|" + babies.getDiaper() + "\t|" + babies.getTeething() + "\t |"
						+ babies.getPlayTime() + "\n ");
				
				userMenu();

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
