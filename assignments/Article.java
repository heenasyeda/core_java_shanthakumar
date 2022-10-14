package valtechspring.assignments;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("article")
public class Article extends Book {

	
	private String url;
	public Article() {

	}
	
	public Article(String name, String url) {
		super(name);
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
