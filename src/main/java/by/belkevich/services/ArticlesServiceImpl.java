package by.belkevich.services;

import by.belkevich.entities.Article;
import by.belkevich.repository.RepositoryJPAImpl;
import by.belkevich.services.util.ParametersBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author BelkevichVA
 * @since 15.02.2017.
 */

@Service
public class ArticlesServiceImpl extends ParentService <Article> implements ArticlesService  {

    private CategoryService categoryService;

    @Autowired
    public ArticlesServiceImpl(RepositoryJPAImpl<Article, Long> repositoryJPA,
                               CategoryService categoryService) {
        super(repositoryJPA);
        this.categoryService = categoryService;
    }

    @Override
    public List<Article> getArticlesByCategoryName(String name) {
        return repositoryJPA.getAllByNamedQuery("ARTICLE.GET_BY_CATEGORYNAME", ParametersBuilder.newBuilder().addParam("category_name",name).build());
    }
}
