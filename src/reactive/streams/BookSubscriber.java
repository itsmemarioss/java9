package reactive.streams;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

import common.Book;
import common.BookShipper;

public class BookSubscriber implements Subscriber<Book> {

	private Subscription subscription;

	@Override
	public void onSubscribe(Subscription subscription) {
		this.subscription = subscription;
		subscription.request(1);
	}

	@Override
	public void onNext(Book item) {
		BookShipper.ship(item);
		subscription.request(1);
		
	}

	@Override
	public void onError(Throwable throwable) {
		throwable.printStackTrace();
		
	}

	@Override
	public void onComplete() {
		System.out.println("Todos os livros foram enviados");
		
	}

}
