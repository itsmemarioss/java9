package common;

public class BookShipper {
	
	public static void ship(Book b) {
		try {
			System.out.println("Shipping book..."+b);
			Thread.sleep(3000);
			System.out.println("Shiped");
		} catch (Exception e) {
			System.out.println("Error Shipping the book..."+b);
		}
		
	}

}
