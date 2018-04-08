package br.mackenzie.mackleaps.prototipation.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Tag {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    public List<Description> descriptions;

    public Tag(String title) {
        this.descriptions = new ArrayList<>();

        this.descriptions.add(new Description(title));
    }


    public Tag() {
        this.descriptions = new ArrayList<>();
    }
}
