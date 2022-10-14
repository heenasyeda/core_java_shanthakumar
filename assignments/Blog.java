package valtechspring.assignments;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("blog")
public class Blog extends Book{
	
	
	private String url;
	private int visitedNumbers;

	
	
	
	public Blog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Blog(String name, String url, int visitedNumbers) {
		super(name);
		this.url = url;
		this.visitedNumbers = visitedNumbers;
	}

	@Override
	public String toString() {
		return "Blog [url=" + url + ", visitedNumbers=" + visitedNumbers + "]";
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getVisitedNumbers() {
		return visitedNumbers;
	}

	public void setVisitedNumbers(int visitedNumbers) {
		this.visitedNumbers = visitedNumbers;
	}
	
	
	
	
	
	

}
