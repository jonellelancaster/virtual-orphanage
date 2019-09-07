package virtualorphanage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualOrphanage {

	Map<String, VirtualBaby> babiesInShelter = new HashMap<>();

	public void add(VirtualBaby baby) {
		babiesInShelter.put(baby.getBabyName(), baby);
	}

	public VirtualBaby findBaby(String babyName) {
		return babiesInShelter.get(babyName);
	}

	public Collection<VirtualBaby> getTotalListofBabies() {
		return babiesInShelter.values();
	}

	public void adopt(VirtualBaby baby) {
		babiesInShelter.remove(baby.getBabyName(), baby);
	}


	

	public void feedAllBabies() {

		for (VirtualBaby baby : babiesInShelter.values()) {
			baby.feed();

		}

	}

	public boolean isBabyAdoptable(String babyName) {
		return babiesInShelter.containsKey(babyName);

	}

	public void changeAllTheBabiesDiapers() {
		for (VirtualBaby baby : babiesInShelter.values()) {
			baby.changeDiaper();
		}
		
		
		
	}

	public void giveAllBabiesDrink() {
		for(VirtualBaby baby: babiesInShelter.values()) {
			baby.giveDrink();
		}
		
	
			
		}

	public boolean canPLayWithBaby(String babyName) {
		return babiesInShelter.containsKey(babyName);
	}

	public void tickForAllBabies() {
		for(VirtualBaby baby: babiesInShelter.values()) {
			baby.tick();
		}

		}

	public void playWithBaby(VirtualBaby baby) {
		baby.playWithBaby();
		
	}
		
	}
		
	
		
	


