package hust.soict.dsai.aims.media;

import java.util.*;

public class Book extends Media {
		
	private List<String> authors = new ArrayList<String>();

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}
	public void addAuthor(String authorName) {
		for(String author: authors) {
			if(author.equals(authorName)) {
				System.out.println("the author already in book");
			}
			else {
				this.authors.add(authorName);
				System.out.printf("%s has been added",authorName);
			}
		}
	}
	public void removeAuthor(String authorName) {
		boolean isRemove = false;
		for(String author: authors) {
			if(author.equals(authorName)) {
				this.authors.remove(authorName);
				System.out.printf("author %s has been remove\n");
				isRemove = true;
			}
		}
		if(isRemove == false) {
			System.out.printf("author %s not in this book",authorName);
		}
	}
}