package graphqlapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import graphqlapp.model.Book;
import graphqlapp.repository.BookRepository;

@Service
public class AddBookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public Book addBook(String isn,String title ,String publisher) {
		
		Book book =new Book(isn,title,publisher,"","");
        bookRepository.save(book);
        return book;
		
	}

}
