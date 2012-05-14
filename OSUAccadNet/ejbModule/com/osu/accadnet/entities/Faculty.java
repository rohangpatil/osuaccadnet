package com.osu.accadnet.entities;

import java.util.List;



public class Faculty extends AcadNetUser {
	
	private String website;
	private String displayPicPath;
	private List<String> interests;
	private List<Publication> publications;
	private List<Student> advisingStudents;
	
	
	public String getDisplayPicPath() {
		return displayPicPath;
	}
	public void setDisplayPicPath(String displayPicPath) {
		this.displayPicPath = displayPicPath;
	}
	public List<String> getInterests() {
		return interests;
	}
	public void setInterests(List<String> interests) {
		this.interests = interests;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public List<Student> getAdvisingStudents() {
		return advisingStudents;
	}
	public void setAdvisingStudents(List<Student> advisingStudents) {
		this.advisingStudents = advisingStudents;
	}
	public List<Publication> getPublications() {
		return publications;
	}
	public void setPublications(List<Publication> publications) {
		this.publications = publications;
	}
	
}
