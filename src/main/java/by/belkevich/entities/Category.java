package by.belkevich.entities;

import javax.persistence.*;
import java.util.Set;

/**
 * @author BelkevichVA
 * @since 15.02.2017.
 */

@Entity
@Table(name="category")
public class Category extends ParentEntity {

    private static final long serialVersionUID = -5762036796842765758L;

    @Column(name="name", nullable = false)
    private String name;


    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private Set<Article> articles;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
