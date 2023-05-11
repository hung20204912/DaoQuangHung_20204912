package hust.soict.dsai.test.store.StoreTest;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store.Store;

public class StoreTest {
	public static void main(String[] args) {
		// Create a new store
		Store store = new Store();

		// Create new DVD objects
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", null, 0, 18.99f);

		// Add DVDs to the store
		store.addDVD(dvd1);
		store.addDVD(dvd2);
		store.addDVD(dvd3);

		// Test removing a DVD from the store
		store.removeDVD(dvd2);

		// Test removing a DVD that is not in the store
		store.removeDVD(dvd2);
	}
}
