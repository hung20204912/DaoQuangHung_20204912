package hust.soict.dsai.aims.cart.Cart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.lang.Math;
import hust.soict.dsai.aims.media.*;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media> ();

    public void addMedia(Media media){
    	if(itemsOrdered.size() < 21){
            itemsOrdered.add(media); 
        	System.out.printf("%s has been in the cart\n", media.getTitle());
        }
        else{
            System.out.println("The cart is almost full");
        }
    }
    public void addMedia(Media [] medialist){
        if(medialist.length + itemsOrdered.size() > 21 ){
            System.out.println("The cart is almost full");
        }
        else{
            for(int i = 0; i < medialist.length; i++){
                itemsOrdered.add(medialist[i]);
                System.out.printf("%s has been in the cart\n",medialist[i].getTitle());
            }
            
        }
    }
    public void addMedia(Media media1, Media media2){
        if(itemsOrdered.size() + 2 > 21){
            System.out.println("The cart is almost full");
        }
        else{
                itemsOrdered.add(media1);
                itemsOrdered.add(media2);
                System.out.printf("%s and %s has been in the cart\n",media1.getTitle(),media2.getTitle());
            }
        }
    public void removeMedia(Media media){
        boolean isRemove = itemsOrdered.remove(media);
    	
    	if(isRemove == false) {
    		System.out.printf("%s not in cart",media.getTitle());
    	}
    }
    public float totalCost(){
        float total = 0;
        System.out.println();
        Media lucky = this.getLuckyItem();
        for(Media media: itemsOrdered){
        	if(itemsOrdered.size() >= 5 && media.getTitle().equals(lucky.getTitle())) {
        		System.out.println("Your lucky items is" + lucky.getTitle());
        	}
        	else {
        		total += media.getCost();
        	}
        }
        return total;
        }
        private static void orderbycost(List<Media> media) {
            Collections.sort(media, new Comparator<Media>() {

            public int compare(Media o1, Media o2) {

            	Float x3 = o1.getCost();
                Float x4 = o2.getCost();
                int cComp = x3.compareTo(x4);
                if (cComp != 0){
                    return cComp;}
            	String x1 = o1.getTitle();
                String x2 = o2.getTitle();
                int tComp = x1.compareTo(x2);
                return tComp;
            }});}
                
    private static void order(List<Media> media) {
        Collections.sort(media, new Comparator<Media>() {

        public int compare(Media o1, Media o2) {

            String x1 = o1.getTitle();
            String x2 = o2.getTitle();
            int tComp = x1.compareTo(x2);

            if (tComp != 0) {
               return tComp;
            } 

            Float x3 = o1.getCost();
            Float x4 = o2.getCost();
            int cComp = x3.compareTo(x4);
            return cComp;  
}});}

    public void sortbytitle() {
        int i = 0;
    	order(itemsOrdered);
        for(Media media: itemsOrdered){
            System.out.print(i+".Media-");
            System.out.printf("%s-%s:%f$",media.getTitle(),media.getCategory(),
            media.getCost());
            System.out.println();
            i++;
        }
    }
    public void sortbycost() {
        int i = 0;
    	orderbycost(itemsOrdered);
        for(Media media: itemsOrdered){
            System.out.print(i+".Media-");
            System.out.printf("%s-%s:%f$",media.getTitle(),media.getCategory(),
            media.getCost());
            System.out.println();
            i++;
        }
    }
    public void print(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        order(itemsOrdered);
        int i = 0;
        for(Media media: itemsOrdered){
        	System.out.print(i+".Media-");
            System.out.printf("%s-%s:%f$",media.getTitle(),media.getCategory(),
           media.getCost());
            System.out.println();
            i++;
        }
        System.out.println("Total cost: " + this.totalCost());
        System.out.println("***************************************************");
    }
    public void Search(int id){
        boolean dis = true;
        for(Media media: itemsOrdered){
            if (id == media.getId()){
                System.out.printf("%s-%f",media.getTitle(),media.getCost());
                dis = false;
            }
        }
        if (dis){
            System.out.println("the disc haven't been in Cart!");
        }
    }
	public void Search(String title) {
		boolean in = true;
		for(Media media: itemsOrdered){
			if( media.isMatch(title)) {
				System.out.printf("%s -%f",media.getTitle(),media.getCost());
				in = false;
				}
		}
		if(in) {
			System.out.println("The disc hadn't been in cart");
		}
	}
	public Media getLuckyItem() {
		 int i = (int)(Math.random()*(itemsOrdered.size() + 1));
		 return itemsOrdered.get(i);
	}
}