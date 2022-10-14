package valtechspring.assignments;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import valtechspring.orm.Tx;

@Entity
public class Publisher {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String name;
	private int phone;

	@OneToOne(targetEntity = Address.class)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private Address address;

	@OneToMany(targetEntity = Book.class, cascade = { CascadeType.MERGE,
			CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "publisher")
	private Set<Book> Book;

	public Publisher() {
	}

	public Publisher(String name, int phone) {
		super();

		this.name = name;

		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Book> getBook() {
		return Book;
	}

	public void setBook(Set<Book> book) {
		Book = book;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

}
