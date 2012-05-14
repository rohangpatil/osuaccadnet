package com.osu.accadnet.entities;

import java.util.List;

public class Student extends AcadNetUser{

	private List<String> interests;
	private Faculty adviser;
	
	public List<String> getInterests() {
		return interests;
	}
	public void setInterests(List<String> interests) {
		this.interests = interests;
	}
	public Faculty getAdviser() {
		return adviser;
	}
	public void setAdviser(Faculty adviser) {
		this.adviser = adviser;
	}
	
	

}
