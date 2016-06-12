package org.speranza.controller;

import javax.inject.Inject;
import javax.interceptor.Interceptors;

import org.speranza.Interfaces.INumberGenerator;
import org.speranza.annotation.ThirteenDigits;
import org.speranza.model.Book;

@Interceptors(LoggingInterceptor.class)
public class BookService {

	@Inject
	@ThirteenDigits
	private INumberGenerator numberGenerator;
	
	public Book createBook(String description, Float price, String title) {
		Book book = new Book(title, price, description);
		book.setIsbn(numberGenerator.generateNumber());
		return book;
	}
}
