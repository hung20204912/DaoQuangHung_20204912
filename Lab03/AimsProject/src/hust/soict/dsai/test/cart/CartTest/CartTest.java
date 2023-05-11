package hust.soict.dsai.test.cart.CartTest;

import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class CartTest {
	public static void main(String[] args) {
		//Create a new cart
		Cart cart = new Cart();
		
		//Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		dvd1.setId(1);

		cart.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		dvd2.setId(2);

		cart.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", null, 0, 18.99f);
		dvd3.setId(3);

		cart.addDigitalVideoDisc(dvd3);
		
		//Test the print method
		cart.print();
		//To-do: test the search method here
		
		// test the search by ID method
		DigitalVideoDisc result = cart.searchById(2);
		System.out.println(result);
		// test the search by title method
		cart.searchByTitle("Lion");
		cart.searchByTitle("Wars");
		cart.searchByTitle("Aladin");

		// test the remove method
		cart.removeDigitalVideoDisc(dvd2);
		cart.print();
		
	}
}
