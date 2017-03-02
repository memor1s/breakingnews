package by.belkevich.services;

import by.belkevich.entities.Slide;
import by.belkevich.repository.RepositoryJPAImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by
 *
 * @author Belkevich V.A.
 *         26.02.2017 12:12
 */
@org.springframework.stereotype.Service
public class SlideServiceImpl extends ParentService<Slide> implements SlideService {

    @Autowired
    public SlideServiceImpl(RepositoryJPAImpl<Slide, Long> repositoryJPA) {
        super(repositoryJPA);
    }

}
