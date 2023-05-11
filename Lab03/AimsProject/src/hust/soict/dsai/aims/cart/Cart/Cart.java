package hust.soict.dsai.aims.cart.Cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Cart {
    private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        itemsOrdered.add(disc);
        System.out.println("The disc " + disc.getTitle() + " has been added.");
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.contains(disc)) {
            itemsOrdered.remove(disc);
            System.out.println("The disc " + disc.getTitle() + " has been removed.");
        } else {
            System.out.println("The disc " + disc.getTitle() + " is not in the cart.");
        }
    }

    public float totalCost() {
        float total = 0;
        for (DigitalVideoDisc disc : itemsOrdered) {
            total += disc.getCost();
        }
        return total;
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int count = 1;
        for (DigitalVideoDisc disc : itemsOrdered) {
            System.out.printf("%d. DVD - %s - %s - %s - %d:%d - %.2f$\n",
                    count++, disc.getTitle(), disc.getCategory(), disc.getDirector(),
                    disc.getLength() / 60, disc.getLength() % 60, disc.getCost());
        }
        System.out.printf("Total cost: %.2f$\n", totalCost());
        System.out.println("***************************************************");
    }

    public DigitalVideoDisc searchById(int id) {
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc.getId() == id) {
                return disc;
            }
        }
        System.out.println("No DVD with ID " + id + " found in the cart!");
        return null;
    }


    public void searchByTitle(String title) {
        boolean found = false;
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc.isMatch(title)) {
                System.out.println("Match found: " + disc.getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No match found.");
        }
    }
}
