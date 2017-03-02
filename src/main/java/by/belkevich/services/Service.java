package by.belkevich.services;

import java.io.Serializable;
import java.util.List;

/**
 * @author BelkevichVA
 * @since 15.02.2017.
 */
interface Service<T extends Serializable> {

    void add(T obj);

    void addInTransaction(T obj);

    T get(Long id);

    T getInTransaction(Long id);

    void update(T obj);

    void updateInTransaction(T obj);

    void deleteInTransaction(T obj);

    void deleteByIdInTransaction(Long id);

    List<T> getAll();

    List<T> getAllLimit(int offset, int limit);

    int getCount();
}
