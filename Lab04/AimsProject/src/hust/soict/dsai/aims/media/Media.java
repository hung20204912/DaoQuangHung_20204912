package hust.soict.dsai.aims.media;

import java.time.LocalDate;

public class Media {
	
	private int id;
	private String title;
	private String category;
	private float cost;
	private LocalDate dateAdded;
	private static int nbMedia;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public LocalDate getDateAdded() {
		return dateAdded;
	}

	public Media() {
		nbMedia += 1;
		this.id = nbMedia;
		LocalDate time = LocalDate.now();
		this.dateAdded = time;
	}
	public Media(String title) {
		this.title = title;
		nbMedia += 1;
		this.id = nbMedia;
		LocalDate time = LocalDate.now();
		this.dateAdded = time;
	}
	public Media(String title,String category,float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbMedia += 1;
		this.id = nbMedia;
		LocalDate time = LocalDate.now();
		this.dateAdded = time;
	}
	public String toString(){
        return title ;
    }
    public boolean isMatch(String title) {
    	return this.title.contains(title);
    }

}