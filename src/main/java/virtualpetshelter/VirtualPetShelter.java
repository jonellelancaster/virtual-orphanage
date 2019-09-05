package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualBaby> babies = new HashMap<>();


	public void add(VirtualBaby baby) {
		babies.put(baby.getBabyName(), baby);
	}

	public VirtualBaby findBaby(String babyName) {
		return babies.get(babyName);
	}

	public Collection<VirtualBaby> getTotalListofBabies() {
		return babies.values();
	}

	public void adopt(VirtualBaby baby) {
		babies.remove(baby.getBabyName(), baby);

	
	

	}


	}

	
	
