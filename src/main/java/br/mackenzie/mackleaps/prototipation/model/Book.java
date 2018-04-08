package br.mackenzie.mackleaps.prototipation.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    public List<Description> descriptions;

    public Book(String title, Tag tag) {
        this.descriptions = new ArrayList<>();

        this.descriptions.add(new Description(title));
        this.tag = tag;
    }

    public Book(){
        this.descriptions = new ArrayList<>();
    }

    @ManyToOne
    private Tag tag;

}
