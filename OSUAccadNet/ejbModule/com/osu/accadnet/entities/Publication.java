package com.osu.accadnet.entities;

import java.util.ArrayList;
import java.util.Date;

public class Publication {
	private Long id;
	private Date publicationDate;
	private String conference;
	private ArrayList<Faculty> authors;
	private String title;
	
	public Date getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}
	public String getConference() {
		return conference;
	}
	public void setConference(String conference) {
		this.conference = conference;
	}
	public ArrayList<Faculty> getAuthors() {
		return authors;
	}
	public void setAuthors(ArrayList<Faculty> authors) {
		this.authors = authors;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
