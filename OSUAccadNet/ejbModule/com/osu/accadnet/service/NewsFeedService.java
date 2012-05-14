package com.osu.accadnet.service;

import javax.ejb.Remote;
import java.util.List;

import com.osu.accadnet.entities.NewsFeed;

@Remote
public interface NewsFeedService {
	void saveNewsFeed(NewsFeed newsFeed);
	NewsFeed findNewsfeed(NewsFeed newsFeed);
	List<NewsFeed> retrieveAllNewsFeed();
}
