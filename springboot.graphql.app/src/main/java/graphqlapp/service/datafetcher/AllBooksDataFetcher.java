package graphqlapp.service.datafetcher;


import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import graphqlapp.model.Book;
import graphqlapp.service.AllBookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AllBooksDataFetcher implements DataFetcher<List<Book>> {

	@Autowired 
	AllBookService allBookService;

    @Override
    public List<Book> get(DataFetchingEnvironment dataFetchingEnvironment) {
//    	AllBookService allBookService = (AllBookService) environment.getContext();
        return allBookService.getAllBooks();
    }
}
