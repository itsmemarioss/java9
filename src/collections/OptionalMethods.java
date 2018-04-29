package collections;

import java.util.List;

import common.*;

public class OptionalMethods {
	
	public static void main(String[] args) {
		List<Book> books = Book.getStaticList();
				
		books.stream().findAny().ifPresentOrElse(System.out::println, ()-> System.out.println("else..."));
		
	}

}
