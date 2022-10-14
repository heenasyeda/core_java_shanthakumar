package valtechspring.assignments;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import valtechspring.assignments.Address;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String name;
	private int phNumber;

	@OneToOne(targetEntity = Address.class)
	  @JoinColumn(name="address_id",referencedColumnName="id")
	private Address address;

	@ManyToMany(targetEntity = Book.class, cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	@JoinTable(name = "Books_Author", joinColumns = @JoinColumn(name = "Author_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "Book_id", referencedColumnName = "id"))
	private Set<Book> Books;

	public Author() {

	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public Author(String name, int phNumber) {

		this.name = name;
		this.phNumber = phNumber;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", phNumber=" + phNumber + "]";
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

	public int getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(int phNumber) {
		this.phNumber = phNumber;
	}

	public Set<Book> getBooks() {
		return Books;
	}

	public void setBookss(Set<Book> books) {
		this.Books = books;
	}

	public void addBook(Book ac) {
		if (getBooks() == null) {

			Books = new HashSet<Book>();
		}
		Books.add(ac);
		if (ac.getAuthor() == null) {
			ac.setAuthor(new HashSet<Author>());
		}
		ac.getAuthor().add(this);
	}

	public void setBooks(Set<Book> books) {
		Books = books;
	}

}
