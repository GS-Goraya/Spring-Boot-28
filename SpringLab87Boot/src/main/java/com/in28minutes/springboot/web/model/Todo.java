package com.in28minutes.springboot.web.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String user;
	private String dessc;
	private Date targetDate;
	private boolean isDone;

	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Todo(int id, String user, String dessc, Date targetDate, boolean isDone) {
		super();
		this.id = id;
		this.user = user;
		this.dessc = dessc;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDessc() {
		return dessc;
	}

	public void setDessc(String dessc) {
		this.dessc = dessc;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", user=" + user + ", dessc=" + dessc + ", targetDate=" + targetDate + ", isDone="
				+ isDone + "]";
	}

}