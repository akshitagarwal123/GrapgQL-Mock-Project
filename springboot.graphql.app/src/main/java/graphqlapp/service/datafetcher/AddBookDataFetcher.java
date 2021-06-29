package graphqlapp.service.datafetcher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import graphqlapp.model.Book;
import graphqlapp.service.AddBookService;

@Component
public class AddBookDataFetcher implements DataFetcher<Book>{
	
	@Autowired
	private AddBookService addBookService;


    @Override
    public Book get(DataFetchingEnvironment dataFetchingEnvironment) {
        String isn = dataFetchingEnvironment.getArgument("isn");
        String title = dataFetchingEnvironment.getArgument("title");
        String publisher = dataFetchingEnvironment.getArgument("publisher");
        
        return addBookService.addBook(isn,title,publisher);
    }

}
