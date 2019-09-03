package virtualpetshelter;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {

	VirtualPetShelter underTest;
	VirtualBaby baby1;
	VirtualBaby baby2;

	@Before
	public void addNewBaby() {
		underTest = new VirtualPetShelter();
		baby1 = new VirtualBaby("babyname", "description");
		baby2= new VirtualBaby("babyname2" , "description2");
	}

	@Test
	public void shouldAddBaby() {
		underTest.add(baby1);
		VirtualBaby retrieveBaby = underTest.findBaby("babyname");
		assertThat(retrieveBaby, is(baby1));

	}

	@Test
	public void shouldAddAnotherBaby() {
		underTest.add(baby1);
		underTest.add(baby2);
		Collection<VirtualBaby> totalListofBabies= underTest.gettotalListofBabies();
		assertThat(totalListofBabies, containsInAnyOrder(baby1, baby2));
		assertEquals(2, totalListofBabies.size());	
	}
	@Test
	public void shouldAdoptABaby() {
		underTest.add(baby1);
		underTest.adopt(baby1);
		VirtualBaby retrieveBaby=underTest.findBaby(baby1.getBabyName());
		assertThat(retrieveBaby, is(nullValue()));
		
	}
	//What else would affect the map? build out test here first. 
	
	
}
