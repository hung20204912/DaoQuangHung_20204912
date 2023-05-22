package hust.soict.dsai.aims.Aims;


import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

import hust.soict.dsai.aims.cart.Cart.Cart;

import hust.soict.dsai.aims.store.Store.Store;

import java.util.Scanner;

public class Aims {
	public static void main(String[] args){
		Scanner k = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		Cart anOrder = new Cart();
		Store newStore = new Store();
		Thread memory = new Thread();
		memory.setDaemon(true);
		memory.start();
		
		DigitalVideoDisc dvdx = new DigitalVideoDisc("The lion King","Animation","Roger Allers",87,19.95f);
		newStore.addMedia(dvdx);
		DigitalVideoDisc dvdy = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		newStore.addMedia(dvdy);
		DigitalVideoDisc dvdz = new DigitalVideoDisc("Aladin","Animation",18.99f);
		newStore.addMedia(dvdz);
		while(true) {
			showMenu();
			int input = k.nextInt();
			if(input == 0) {break;}
			else if(input == 1) {
				newStore.ViewStore(); 
				StoreMenu();
				int input1 = k.nextInt();
				if(input1 == 0) {
					continue;
				}
				else if(input1 == 1 ) {
					System.out.println("Enter the title:");
					String titleEnter1 = k.nextLine(); 
					anOrder.Search(titleEnter1);
				}
				else if(input1==2) {
					System.out.println("Enter the title");
					String titleEnter2 = s.nextLine();
					DigitalVideoDisc dvd1 = new DigitalVideoDisc(titleEnter2);
					anOrder.addMedia(dvd1);
				}
				else {
					anOrder.print();
				}
				}
			else if(input == 2){ 
				System.out.println("to add enter 1\nto remove enter 2");
				int input2 = k.nextInt();
				if(input2 == 1){System.out.println("Enter the title"); String titleEnter3 = k.nextLine();
				DigitalVideoDisc dvd2 = new DigitalVideoDisc(titleEnter3);
				newStore.addMedia(dvd2);
				}
				else if(input2 == 2) {
					System.out.println("Enter the title");
					String titleEnter4 = s.nextLine();
					DigitalVideoDisc dvd3 = new DigitalVideoDisc(titleEnter4);
					newStore.removeMedia(dvd3);
				}
				}
			else if(input == 3) {
				cartMenu();
				int input3 = k.nextInt();
				if(input3 == 0) {
					continue;
				}
				else if(input3 == 1) {
					System.out.println("Filter medias in cart");
					System.out.println("--------------------------------");
					System.out.println("1. BY ID");
					System.out.println("2. BY TITLE");
					System.out.println("0. Exit");
					System.out.println("--------------------------------");
					System.out.println("Please choose a number: 0-1-2");
					int input4 = k.nextInt();
					if(input4 == 1) {
						System.out.println("Please enter ID: ");
						int input5 = k.nextInt();
						anOrder.Search(input5);
					}
					else if(input4 == 2) {
						System.out.println("Please enter Title: ");
						String input6 = s.nextLine();
						anOrder.Search(input6);
					}
					else {
						continue;
					}
				}
				else if(input3 == 2){
					 System.out.println("Do you want to sort by?");
                     System.out.println("1. Title");
                     System.out.println("2. Cost");
                     System.out.println("0. Exit");
                     int input6 = k.nextInt();
                     if(input6 == 1) {
                    	 anOrder.sortbytitle();
                     }
                     else if(input6 == 2) {
                    	 anOrder.sortbycost();
                     }
                     else{
                    	 continue;
                     }
				}
				else if(input3 == 3) {
					System.out.println("Please enter Title: ");
					String input7 = s.nextLine();
					DigitalVideoDisc dvd4 = new DigitalVideoDisc(input7);
					anOrder.removeMedia(dvd4);
				}
				else if(input3 == 4) {
					anOrder.print();
				}
			}
				}
		
    }
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	public static void StoreMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a DVD’s details");
		System.out.println("2. Add a DVD to cart");
		System.out.println("3. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		}	
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter DVDs incart");
		System.out.println("2. Sort DVDs in cart");
		System.out.println("3. Remove DVD from cart");
		System.out.println("4. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		}
}