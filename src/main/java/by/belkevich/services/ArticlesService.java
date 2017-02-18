package by.belkevich.services;

import by.belkevich.entities.Article;
import by.belkevich.entities.Category;

import java.util.List;

/**
 * @author BelkevichVA
 * @since 15.02.2017.
 */
public interface ArticlesService extends Service<Article> {

    List<Article> getArticlesByCategoryName(String name);

}
