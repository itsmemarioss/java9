package reactive.streams;

import java.util.concurrent.Flow.Processor;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.SubmissionPublisher;

import common.Book;

public class BookFilterProcessor extends SubmissionPublisher<Book> implements Processor<Book, Book> {

	private Subscription subscription;
	
	@Override
	public void onSubscribe(Subscription subscription) {
		this.subscription= subscription;
		subscription.request(1);
		
	}

	@Override
	public void onNext(Book item) {
		if(inStock(item)) {
			submit(item);
		}else {
			System.out.println("Não existe livro em estoque");
		}
		
	}

	private boolean inStock(Book item) {
		return false;
	}

	@Override
	public void onError(Throwable throwable) {
		throwable.printStackTrace();
	}

	@Override
	public void onComplete() {
		close();		
	}

}
