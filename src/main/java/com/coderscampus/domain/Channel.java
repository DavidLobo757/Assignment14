package com.coderscampus.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="channels")
public class Channel {
	
	// make sure to have a one to many with messages
	
	private int channelId;
	private String channel;
	private List<Message> messages = new ArrayList<>();
	private List<User> users = new ArrayList<>();
	
	public int getChannelId() {
		return channelId;
	}
	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}
	@OneToMany(mappedBy = "channel")
	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	
	@ManyToMany(mappedBy="channels")
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public int getId() {
		return channelId;
	}
	public void setId(int id) {
		channelId = id;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	
	
}
