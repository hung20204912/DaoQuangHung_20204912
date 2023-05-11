package hust.soict.dsai.aims.store.Store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {
	private DigitalVideoDisc[] itemsInStore;
	private int currentIndex;
	private final int MAX_NUMBERS_ITEMS = 100;
	
	public Store() {
		itemsInStore = new DigitalVideoDisc[MAX_NUMBERS_ITEMS];
		currentIndex = 0;
	}
	
	public void addDVD(DigitalVideoDisc disc) {
		if (currentIndex < MAX_NUMBERS_ITEMS) {
			itemsInStore[currentIndex] = disc;
			currentIndex++;
			System.out.println("The disc has been added to the store.");
		}
		else {
			System.out.println("The store is full, cannot add more discs.");
		}
	}
	
	public void removeDVD(DigitalVideoDisc disc) {
		boolean found = false;
		for (int i = 0; i < currentIndex; i++) {
			if (itemsInStore[i] == disc) {
				found = true;
				// Remove the disc by shifting all elements after it to the left
				for (int j = i; j < currentIndex - 1; j++) {
					itemsInStore[j] = itemsInStore[j + 1];
				}
				itemsInStore[currentIndex - 1] = null;
				currentIndex--;
				System.out.println("The disc has been removed from the store.");
				break;
			}
		}
		if (!found) {
			System.out.println("The disc is not in the store, cannot remove.");
		}
	}
}
