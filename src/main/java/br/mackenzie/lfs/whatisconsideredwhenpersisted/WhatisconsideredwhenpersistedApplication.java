package br.mackenzie.lfs.whatisconsideredwhenpersisted;

import br.mackenzie.lfs.whatisconsideredwhenpersisted.model.Book;
import br.mackenzie.lfs.whatisconsideredwhenpersisted.model.Tag;
import br.mackenzie.lfs.whatisconsideredwhenpersisted.repositories.BookRepository;
import br.mackenzie.lfs.whatisconsideredwhenpersisted.repositories.TagRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class WhatisconsideredwhenpersistedApplication implements CommandLineRunner {

	@Autowired
	private BookRepository bookRepo;

	@Autowired
	private TagRepository tagRepo;

	public static void main(String[] args) {
		SpringApplication.run(WhatisconsideredwhenpersistedApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Tag tag = new Tag();
		tag.setDescription("Doentio");

		tagRepo.saveAndFlush(tag);


		Tag justatagwithid = new Tag();
		justatagwithid.setId(tag.getId());
		justatagwithid.setDescription("hey! Still doentio");

		Book book = new Book();
		book.setTitle("Lolita");
		book.setTag(justatagwithid);
		bookRepo.saveAndFlush(book);
//		book.setTag(justatagwithid);



	}
}
