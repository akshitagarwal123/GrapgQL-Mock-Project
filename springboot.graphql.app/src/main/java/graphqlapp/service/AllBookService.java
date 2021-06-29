package graphqlapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import graphqlapp.model.Book;
import graphqlapp.repository.BookRepository;

@Service
public class AllBookService {
	
	 @Autowired
	 private BookRepository bookRepository;
	 
	 public List<Book> getAllBooks() {
		 
	        return bookRepository.findAll();
	    }

}
