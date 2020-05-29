package com.lucasaguiar.booksservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@EnableEurekaClient
public class BooksServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksServiceApplication.class, args);
	}

	@Data
	@AllArgsConstructor
	public class Book{
		private String title;
	}

	@RestController
	@RequestMapping("/books")
	public class BookController{

//		@GetMapping("/api/bookg/{id}")
//		public ResponseEntity<String> getBook(@PathVariable String id){
//			return new ResponseEntity<String>("Book: " + id, HttpStatus.OK);
//		}

		@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<String> hello(){
			return new ResponseEntity<String>("Hello: ", HttpStatus.OK);
		}
	}

}
