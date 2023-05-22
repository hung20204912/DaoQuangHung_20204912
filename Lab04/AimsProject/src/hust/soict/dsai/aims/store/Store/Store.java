package hust.soict.dsai.aims.store.Store;

import hust.soict.dsai.aims.media.*;
import java.util.*;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	
	public void addMedia(Media media) {
		boolean isAdded = false;
		for(Media media1: itemsInStore) {
			if(media1.getTitle().equals(media.getTitle())) {
				System.out.printf("%s already in store\n",media1.getTitle());
				isAdded = true;
			}
		}
		if(isAdded == false) {
			itemsInStore.add(media);
			System.out.printf("%s has been in store",media.getTitle());
		}
	}
	public void removeMedia(Media media) {
		boolean in = true; 
		for(Media media1: itemsInStore) {
			if(media1.getTitle().equals(media.getTitle())) {
				itemsInStore.remove(media);
                in = false;
                System.out.printf("%s has been remove\n", media.getTitle());
			}
		}
		if(in) {
			System.out.printf("the %s not in Store\n", media.getTitle());
		}
	}
	public void ViewStore() {
		int i = 0;
		for(Media media: itemsInStore) {
			System.out.println("Media in store:");
			System.out.printf("%d.Media %s - %f$",i,media.getTitle(),media.getCost());
			System.out.println();
			i++;
		}
	}
}