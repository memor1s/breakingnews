package by.belkevich.services;

import by.belkevich.entities.Category;

/**
 * @author BelkevichVA
 * @since 15.02.2017.
 */
public interface CategoryService extends Service<Category> {

    Category getCategoryByName(String categoryName);
}
