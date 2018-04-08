package br.mackenzie.mackleaps.prototipation.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
class Description {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String description;

    public Description(String title) {
        this.title = title;
    }
}
