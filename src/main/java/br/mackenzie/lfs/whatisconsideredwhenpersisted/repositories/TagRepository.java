package br.mackenzie.lfs.whatisconsideredwhenpersisted.repositories;

import br.mackenzie.lfs.whatisconsideredwhenpersisted.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag,Long> {

}
