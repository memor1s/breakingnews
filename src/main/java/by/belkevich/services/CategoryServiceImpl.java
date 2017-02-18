package by.belkevich.services;

import by.belkevich.entities.Category;
import by.belkevich.repository.RepositoryJPAImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

/**
 * @author BelkevichVA
 * @since 15.02.2017.
 */
@org.springframework.stereotype.Service
public class CategoryServiceImpl extends ParentService<Category> implements CategoryService {

    @Autowired
    public CategoryServiceImpl(RepositoryJPAImpl<Category, Long> repositoryJPA) {
        super(repositoryJPA);
    }
}
