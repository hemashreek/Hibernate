package com.mphasis.training.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Playera {

	@Id
	private int pid;
	private String pName;
	private String gender;
	private String contact;
	private String email;
	private int age;
	private String teamname;
	private java.util.Date dob;
	private long score;
	public Playera() {
		super();
		this.pid = pid;
		this.pName = pName;
		this.gender = gender;
		this.contact = contact;
		this.email = email;
		this.age = age;
		this.teamname = teamname;
		this.dob = dob;
		this.score = score;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return pName;
	}
	public void setName(String pName) {
		this.pName = pName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public java.util.Date getDob() {
		return dob;
	}
	public void setDob(java.util.Date dob) {
		this.dob = dob;
	}
	public long getScore() {
		return score;
	}
	public void setScore(long score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Player [pid=" + pid + ", name=" + pName + ", gender=" + gender + ", contact=" + contact + ", email="
				+ email + ", age=" + age + ", teamname=" + teamname + ", dob=" + dob + ", score=" + score + "]";
	};
	
}
