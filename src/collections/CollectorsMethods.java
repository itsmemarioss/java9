package collections;

import java.util.List;
import java.util.stream.Collectors;

import common.Book;
import common.Category;

public class CollectorsMethods {
	public static void main(String[] args) {
		
		List<Book> books = Book.getStaticList();
		
		books.stream().collect(
				
			Collectors.filtering(b -> b.getCategories().contains(Category.AGILE), 
			Collectors.toList())
			
		);
		
	}
}
