package com.coderscampus.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "message")
public class Message {
	private LocalDateTime DateTime;
	private String username;
	private String text;
	private int channelId;
	
	
	public LocalDateTime getDateTime() {
		return DateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		DateTime = dateTime;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	@ManyToOne
	@JoinColumn(name="account_id")
	public int getChannelId() {
		return channelId;
	}
	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}
	
	
	
}
