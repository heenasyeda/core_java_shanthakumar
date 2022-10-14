package valtechspring.assignments;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import valtechspring.assignments.Address;

public class assignmentsClient {

	public static void main(String[] args) {
		// SessionFactory sf = new Configuration();
		SessionFactory sf = new AnnotationConfiguration().configure().addAnnotatedClass(Author.class)
				.addAnnotatedClass(Address.class).addAnnotatedClass(Publisher.class).addAnnotatedClass(Book.class)
				.addAnnotatedClass(Article.class).addAnnotatedClass(Blog.class).addAnnotatedClass(HandBook.class)

				.buildSessionFactory();

		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();

		/*
		 * Author author = new Author("heena", 121212);
		 * ses.saveOrUpdate(author);
		 */

		/*
		 * Book book = new Book("aa", 121); ses.saveOrUpdate(book);
		 */

		/*
		 * Publisher c1 = new Publisher("Publisher3", "rajivnagar", 987654321);
		 * Publisher c2 = new Publisher("Publisher4", "udaygiri", 9876521);
		 * ses.saveOrUpdate(c1); ses.saveOrUpdate(c2);
		 * 
		 * ses.save(new Book("book1", new Date())); ses.save(new
		 * Article("book1", "https://book1.html")); ses.save(new Blog("book1",
		 * "https://book1.html", 1)); ses.save(new HandBook("book1", 12, new
		 * Date(), 4, 3598));
		 * 
		 * List<Book> txs =
		 * ses.createQuery("SELECT book From Book book").list(); for (Book t :
		 * txs) { // ternary operator boolCond ? true:false
		 * t.setPublisher(t.getId() % 2 == 0 ? c1 : c2);
		 * 
		 * }
		 */

		// Book c1 = new Book("Book3",new Date());
		// Book c2 = new Book("Book4",new Date());
		// ses.saveOrUpdate(c1);
		// ses.saveOrUpdate(c2);
		//
		//
		// Author author = new Author("Ameena", 121212);
		// Author author1 = new Author("Heena", 121212);
		// ses.saveOrUpdate(author);
		// ses.saveOrUpdate(author1);
		//

		/*
		 * 
		 * Author author = new Author("Heena1",987654321); Address address = new
		 * Address("Mysuru1","karnataka1","udayagiri1",570019);
		 * 
		 * ses.saveOrUpdate(author); ses.saveOrUpdate(address);
		 * author.setAddress(address); address.setAuthor(author);
		 * 
		 */

//		 manyToMany
		Author author = new Author("Heena1", 987654321);
		Address address = new Address("Mysuru1", "karnataka1", "udayagiri1", 570019);
		ses.saveOrUpdate(author);
		ses.saveOrUpdate(address);
		author.setAddress(address);
		
		Author author1 = new Author("Heena1", 987654321);


		Book c2 = new Book("Book4", new Date());
		Book c1 = new Book("Book5", new Date());
		ses.saveOrUpdate(c2);
		ses.saveOrUpdate(c1);
		
		
	Book c3=(Book)ses.load(Book.class, 160);
//	author.addBook(c2);
//	author1.addBook(c1);
//		
		tx.commit();
		ses.close();
		sf.close();
	}
}
