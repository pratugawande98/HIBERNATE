package com.cg.client;

import com.cg.entities.Book;
import com.cg.service.BookService;
import com.cg.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {

		BookService service = new BookServiceImpl();
		
		
		System.out.println("************Listing total number of books*************");
		System.out.println("Total books:"+service.getBookCount());
		
		System.out.println("************Listing book with id 103*************");
		System.out.println("Boo with ID 104:"+service.getBookById(103));
		
		System.out.println("************Listing All books*************");
		for(Book book:service.getAllBooks()) {
			System.out.println(book);
		}
		
		
		
		System.out.println("************Listing book written by rama marathe*************");
		for(Book book:service.getAuthorBooks("rama marathe") ) {
			System.out.println(book);
		}
		
		System.out.println("************Listing book on secret*************");
		for(Book book:service.getBookByTitle("secret")) {
			System.out.println(book);
		}
		
		
		
		System.out.println("************Listing All books between 500 and 600*************");
		for(Book book:service.getBooksInPriceRange(300, 600) ) {
			System.out.println(book);
		}
		
		
		
		

	}
}