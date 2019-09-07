package virtualorphanage;

import static org.hamcrest.CoreMatchers.nullValue;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import virtualorphanage.VirtualBaby;
import virtualorphanage.VirtualOrphanage;

public class VirtualOrphanageTest {

	VirtualOrphanage underTest;
	VirtualBaby baby1;
	VirtualBaby baby2;

	@Before
	public void addNewBaby() {
		underTest = new VirtualOrphanage();
		baby1 = new VirtualBaby("babyname", "description");
		baby2 = new VirtualBaby("babyname2", "description2");

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
		Collection<VirtualBaby> totalListofBabies = underTest.getTotalListofBabies();
		assertThat(totalListofBabies, containsInAnyOrder(baby1, baby2));
		assertEquals(2, totalListofBabies.size());
	}

	@Test
	public void shouldAdoptABaby() {
		underTest.add(baby1);
		underTest.adopt(baby1);
		VirtualBaby retrieveBaby = underTest.findBaby(baby1.getBabyName());
		assertThat(retrieveBaby, is(nullValue()));

	}

	@Test
	public void shouldFeedAllBabiesby10() {
		// Arrange
		underTest.add(baby1);
		underTest.add(baby2);
		// Action
		underTest.feedAllBabies();
		// Assertion
		assertEquals(60, baby1.getHungry());
		assertEquals(60, baby2.getHungry());
	}

	@Test
	public void isBabyInShelterShouldBeTrueIfBabyIsThere() {
		underTest.add(baby1);
		boolean result = underTest.isBabyAdoptable(baby1.getBabyName());
		assertTrue(result);
	}
	
	@Test
	public void ifBabyIsNotInShelterReturnFalse() {
	boolean result = underTest.isBabyAdoptable("John");
	assertFalse(result);
	
	}
	@Test
	public void shouldChangeAllBabiesDiapers() {
		underTest.add(baby1);
		underTest.add(baby2);
		underTest.changeAllTheBabiesDiapers();
		assertEquals(60, baby1.getDiaper());
		assertEquals(60, baby2.getDiaper());
	}
	@Test
	public void shouldGiveAllBabiesDrink() {
		underTest.add(baby1);
		underTest.add(baby2);
		underTest.giveAllBabiesDrink();
		assertEquals(60,baby1.getThirst());
		assertEquals(60,baby2.getThirst());
	}
		@Test
		public void canPlaywithBaby() {
			underTest.add(baby1);
			boolean result =underTest.canPLayWithBaby(baby1.getBabyName());
			assertTrue(result);
		}
		@Test
		public void playWithBaby() {
			underTest.add(baby1);
			underTest.playWithBaby(baby1);
			assertEquals(60, baby1.getPlayTime());
			
		}
		
}

		
		
	

