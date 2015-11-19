package com.example.speaker;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Speaker {

	@GeneratedValue
	@Id
	private Long id;

	private String firstName;

	private String lastName;

	private String twitter;

	@Column(columnDefinition = "TEXT")
	private String bio;

	public Speaker() {

	}

	public Speaker(String firstName, String lastName, String twitter) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.twitter = twitter;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

}
