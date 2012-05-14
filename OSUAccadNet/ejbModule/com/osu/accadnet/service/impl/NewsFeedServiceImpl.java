package com.osu.accadnet.service.impl;

import java.util.List;

import com.osu.accadnet.entities.NewsFeed;
import com.osu.accadnet.service.NewsFeedService;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Session Bean implementation class NewsFeedBean
 */
@Stateless

public class NewsFeedServiceImpl implements NewsFeedService {

    @PersistenceContext(unitName = "JPADB")
    private EntityManager entityManager;
    
    public NewsFeedServiceImpl() {
        
    }

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void saveNewsFeed(NewsFeed newsFeed) {
		entityManager.persist(newsFeed);
	}

	@Override
	public NewsFeed findNewsfeed(NewsFeed newsFeed) {
		NewsFeed nf = entityManager.find(NewsFeed.class, newsFeed.getId());
		return nf;
	}

	@Override
	public List<NewsFeed> retrieveAllNewsFeed() {
        String q = "SELECT nf from " + NewsFeed.class.getName() + " p";
        Query query = entityManager.createQuery(q);
        List<NewsFeed> newsfeeds = query.getResultList();
        return newsfeeds;
	}

}
