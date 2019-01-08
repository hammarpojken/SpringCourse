package com.hammar.springboot.springbootproject;



import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
@GetMapping("/books")
	public List<Book> getAllBooks() {
		
		return Arrays.asList(
				new Book(1L, "Snabba Cash", "Jens Lupino"),
				new Book(2L, "Fångarna på fortet", "Fader Fara"));
	}
}
