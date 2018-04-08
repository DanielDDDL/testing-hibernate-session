package br.mackenzie.mackleaps.prototipation;

import br.mackenzie.mackleaps.prototipation.model.Book;
import br.mackenzie.mackleaps.prototipation.model.Tag;
import br.mackenzie.mackleaps.prototipation.repositories.BookRepository;
import br.mackenzie.mackleaps.prototipation.repositories.TagRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SessionHibernateProblem implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepo;

    @Autowired
    private TagRepository tagRepo;

    @Autowired
    private ServiceTest serviceTest;

    public static void main(String[] args) {
        SpringApplication.run(SessionHibernateProblem.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Tag sickTag = new Tag("Sick");
        tagRepo.saveAndFlush(sickTag);
        System.out.println("SICK TAG ID: "+sickTag.getId());


        Tag testTag = new Tag("Not so sick");
        serviceTest.insertTag(testTag);
        System.out.println("TEST TAG ID: "+testTag.getId());

        Tag justWithID = new Tag();
        justWithID.setId(sickTag.getId());

        Book book = new Book("Lolita", justWithID);
        bookRepo.saveAndFlush(book);



    }
}
