package by.belkevich.repository;

import javax.persistence.NamedQuery;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author BelkevichVA
 * @since 15.02.2017.
 */
interface Repository <T extends Serializable, K extends Serializable> {

    void setType(Class<T> type);

    void add(T newInstance);

    T get(K id);

    T update(T obj);

    void delete(T obj);

    void deleteById(K id);

    List<T> getAll();

    int getCount();

    List<T> getAllByNamedQuery(String namedQueryName, Map<String, Object> params);
}
