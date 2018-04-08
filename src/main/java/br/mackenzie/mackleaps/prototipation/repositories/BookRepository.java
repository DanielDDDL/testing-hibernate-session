package br.mackenzie.mackleaps.prototipation.repositories;

import br.mackenzie.mackleaps.prototipation.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long>{

}
