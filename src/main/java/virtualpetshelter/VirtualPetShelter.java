package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualBaby> names=new HashMap<>();
	
	public void add(VirtualBaby baby) {
	names.put(baby.getBabyName(), baby);
	
	
	}

	public VirtualBaby findBaby(String babyName) {
		// TODO Auto-generated method stub
		return names.get(babyName);
	}

	public Collection<VirtualBaby> gettotalListofBabies() {
		return names.values();
	}

	
		
	}

