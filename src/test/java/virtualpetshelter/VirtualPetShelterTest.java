package virtualpetshelter;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

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
		
	}
}
