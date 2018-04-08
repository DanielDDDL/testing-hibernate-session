package br.mackenzie.mackleaps.prototipation;

import br.mackenzie.mackleaps.prototipation.model.Tag;
import br.mackenzie.mackleaps.prototipation.repositories.BookRepository;
import br.mackenzie.mackleaps.prototipation.repositories.TagRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class ServiceTest {

    private BookRepository bookRepo;
    private TagRepository tagRepo;

    @Autowired
    public ServiceTest(BookRepository bookRepo, TagRepository tagRepo) {
        this.bookRepo = bookRepo;
        this.tagRepo = tagRepo;
    }

    public Tag insertTag(Tag tag){
        return tagRepo.saveAndFlush(tag);
    }
}
