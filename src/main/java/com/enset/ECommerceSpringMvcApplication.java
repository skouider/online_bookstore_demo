package com.enset;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.enset.models.Book;
import com.enset.models.BookCategory;
import com.enset.repository.BookCategoryRepository;
import com.enset.repository.BookRepository;

@SpringBootApplication
public class ECommerceSpringMvcApplication implements CommandLineRunner{

	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private BookCategoryRepository categoryRepository;
	@Autowired
	private RepositoryRestConfiguration configuration;
	
	public static void main(String[] args) {
		SpringApplication.run(ECommerceSpringMvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		configuration.exposeIdsFor(Book.class);
		
//	Book b1 =	bookRepository.save(new Book(null, "text-100", "C programming language","learning C programming language", 600, "assets/images/text-100.jpg", true, 100, new Date(), null, null));
//	Book b2 =	bookRepository.save(new Book(null, "text-101", "Java premier language","learning Java programming language", 1200, "assets/images/text-101.jpg", true, 300, new Date(), null, null));
//	Book b3 =	bookRepository.save(new Book(null, "text-102", "SQL for Beginners","SQL for Beginners", 980, "assets/images/text-102.jpg", true, 50, new Date(), null, null));
//	Book b4 =	bookRepository.save(new Book(null, "text-103", "React Js Courses","How to deal with React", 1800, "assets/images/text-103.jpg", true, 450, new Date(), null, null));
//		
		List<Book> listOfBooks1 = bookRepository.findAll();
//		listOfBooks1.add(b4);
//		listOfBooks1.add(b3);
//		List<Book> listOfBooks2 = new ArrayList<Book>();
//		listOfBooks1.add(b1);
//		listOfBooks1.add(b3);
//		List<Book> listOfBooks3 = new ArrayList<Book>();
//		listOfBooks1.add(b2);
//		listOfBooks1.add(b3);
		
		
//  BookCategory c1 =	categoryRepository.save(new BookCategory(null,"Drama",null));
//	BookCategory c2 =	categoryRepository.save(new BookCategory(null,"scientist",null));
//	BookCategory c3 =	categoryRepository.save(new BookCategory(null,"Philosophy",null));
	
		List<BookCategory> categories = categoryRepository.findAll();
		for (BookCategory bookCategory : categories) {
			System.out.println(bookCategory.getBooks());
		}
		for (Book book : listOfBooks1) {
			System.out.println(book.getBookCategory());
		}
	}

}
