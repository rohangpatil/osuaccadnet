package com.osu.accadnet.entities;

import java.util.Date;

public class Message {
	
	private Long id;
	private String messageContent;
	private AcadNetUser from;
	private AcadNetUser to;
	private Date dateTime;
	
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public AcadNetUser getFrom() {
		return from;
	}
	public void setFrom(AcadNetUser from) {
		this.from = from;
	}
	public AcadNetUser getTo() {
		return to;
	}
	public void setTo(AcadNetUser to) {
		this.to = to;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
