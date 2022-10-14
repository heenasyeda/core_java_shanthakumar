package valtechspring.assignments;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String city;
	private String street;
	private String state;
	private int zipcode;

	@OneToOne(targetEntity = Author.class)
	@JoinColumn(name = "author_id", referencedColumnName = "id")
	private Author author;
	
	

	@OneToOne(targetEntity = Publisher.class)
	@JoinColumn(name = "publisher_id", referencedColumnName = "id")
	private Publisher publisher;

	public Address() {
		super();

	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Author getAuthor() {
		return author;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	public Publisher getPublisher() {
		return publisher;
	}

	public Address(String city, String street, String state, int zipcode) {
		super();
		this.city = city;
		this.street = street;
		this.state = state;
		this.zipcode = zipcode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", street=" + street + ", state=" + state + ", zipcode="
				+ zipcode + "]";
	}

}
