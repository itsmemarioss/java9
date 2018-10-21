package reactive.streams;

import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;

import common.Book;
import common.BookShipper;

public class Main {
	
	public static void main(String[] args) {
		SubmissionPublisher<Book> publisher = new SubmissionPublisher<>();
		
		BookSubscriber bookSubscriber = new BookSubscriber();
		
		publisher.subscribe(bookSubscriber);
		
		publisher.submit(new Book("Title", "author"));
		
		System.out.println("Congrats..");
		publisher.close();
		
		new	Scanner(System.in).nextLine();
		
		SubmissionPublisher<Book> publisher2 = new SubmissionPublisher<>();
		BookSubscriber bookSubscriber2 = new BookSubscriber();
		BookFilterProcessor inStockProcessor = new BookFilterProcessor();
		
		publisher2.subscribe(inStockProcessor);
		inStockProcessor.subscribe(bookSubscriber2);
		
		
		publisher2.submit(new Book("Title", "author"));
		
		System.out.println("Congrats...");
		publisher.close();
		
		new	Scanner(System.in).nextLine();
		
	}

}
