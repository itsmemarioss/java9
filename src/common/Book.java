package common;

import java.util.List;

public class Book {
	
	private List<Category> categories;
	private String title;
	private String author;
	
	public Book(String title, String author, Category... categories) {
		super();
		this.categories = List.of(categories);
		this.title = title;
		this.author = author;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	
	public static List<Book> getStaticList(){
		return List.of(
				new Book("Java 9", "Duke", Category.PROGRAMMING),
				new Book("2nd Book", "Author 2", Category.AGILE, Category.PROGRAMMING),
				new Book("3rd Book", "Author 2", Category.PROGRAMMING),
				new Book("4th Book", "Author 3", Category.DESIGN)
				
				);
	}
	
	public boolean containsCategory(Category category) {
		return categories.contains(category);
	}
	
	

}
