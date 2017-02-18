package by.belkevich.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * @author BelkevichVA
 * @since 15.02.2017.
 */
@Entity
@Table(name = "article")
@NamedQueries({
        @NamedQuery(
                name = "ARTICLE.GET_BY_CATEGORYNAME",
                query = "FROM Article AS a WHERE a.category.name = :category_name ORDER BY a.dateCreated DESC"
        )}
)
public class Article extends ParentEntity {

    private static final long serialVersionUID = -2201622758608654410L;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "text")
    private String preview;

    @Column(nullable = false, columnDefinition = "text")
    private String info;

    @Column(name = "datecreated",
            nullable = false,
            updatable = false,
            insertable = false,
    columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
