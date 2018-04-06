package br.mackenzie.lfs.whatisconsideredwhenpersisted.repositories;

import br.mackenzie.lfs.whatisconsideredwhenpersisted.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long>{

}
