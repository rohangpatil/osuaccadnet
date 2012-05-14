package com.osu.accadnet.entities;

import java.util.Date;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity(name = "newsfeed")
public class NewsFeed implements Serializable {
	private static final long serialVersionUID = 1L;
	 
    public NewsFeed() {
        super();
    }
 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Date dateTime;
	private String newsContent;
	private String newsCategory;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getNewsContent() {
		return newsContent;
	}
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}
	public String getNewsCategory() {
		return newsCategory;
	}
	public void setNewsCategory(String newsCategory) {
		this.newsCategory = newsCategory;
	}
	
    @Override
    public String toString() {
        return "NewsFeed [id=" + id + ", datetime=" + dateTime
                + ", newscontent=" + newsContent + ", newscategory=" + newsCategory + "]";
    }
}
