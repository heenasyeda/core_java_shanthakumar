package valtechspring.assignments;

import java.util.Date;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("handbook")
public class HandBook extends Book {
	
	private float price;
	private Date publishedYear;
	private int edition;
	private int isbn;

	public HandBook() {
		super();
	}

	public HandBook(String name, float price, Date publishedYear, int edition, int isbn) {
		super(name);
		this.price = price;
		this.publishedYear = publishedYear;
		this.edition = edition;
		this.isbn = isbn;
	}

	

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public Date getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(Date publishedYear) {
		this.publishedYear = publishedYear;
	}


	

	
	
	
	
	

}
