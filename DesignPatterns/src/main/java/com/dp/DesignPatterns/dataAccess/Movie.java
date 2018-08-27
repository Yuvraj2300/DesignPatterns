package com.dp.DesignPatterns.dataAccess;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Movie implements	Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8546429441151966359L;

	@Id
	@GeneratedValue
	private	int	id;	
	private	String	title;
	private	String	description;
	private	int	price;
	
	@Transient
	private	String	runTimeId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getRunTimeId() {
		return runTimeId;
	}

	public void setRunTimeId(String runTimeId) {
		this.runTimeId = runTimeId;
	}

}
