package br.mackenzie.lfs.whatisconsideredwhenpersisted.dto;

import br.mackenzie.lfs.whatisconsideredwhenpersisted.model.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class CategoryDTO extends DTO <Category,CategoryDTO>{

    private Long id;
    private String title;

    @Override
    Category convertToEntity() {

        Category category = new Category();
        category.setId(this.getId());
        category.setTitle(this.getTitle());

        return category;
    }

    @Override
    Category convertToExistingEntity(Category entity) {

        if(!entity.getId().equals(this.getId()))
            throw new IllegalArgumentException();

        entity.setTitle(this.getTitle());
        return entity;
    }

    @Override
    CategoryDTO convertEntityToDTO(Category entity) {

        this.setId(entity.getId());
        this.setTitle(entity.getTitle());

        return this;
    }
}
