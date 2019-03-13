package com.megabait.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Participant {

	@Id
	private long id;
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String telNumber;
	private String city;
	private String address;
	private String district;
	private Date birthdate;
	private Date repatriationDate;
	private Date lastActiveDate;
	private Gender gender;

	/** All events of this customer */
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private List<Event> partisipantsEvents = new ArrayList<>();
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "participants")
	private Set<Interest> interests = new HashSet<>();

	@Override
	public String toString() {
		return "Participant [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + ", email=" + email + ", telNumber=" + telNumber + ", city=" + city + ", address=" + address
				+ ", district=" + district + ", birthdate=" + birthdate + ", repatriationDate=" + repatriationDate
				+ ", interests=" + interests + ", lastActiveDate=" + lastActiveDate + ", gender=" + gender
				+ ", participatedInEvents=" + partisipantsEvents + "]";
	}

	public Participant() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Date getRepatriationDate() {
		return repatriationDate;
	}

	public void setRepatriationDate(Date repatriationDate) {
		this.repatriationDate = repatriationDate;
	}

	public Date getLastActiveDate() {
		return lastActiveDate;
	}

	public void setLastActiveDate(Date lastActiveDate) {
		this.lastActiveDate = lastActiveDate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public List<Event> getPartisipantsEvents() {
		return partisipantsEvents;
	}

	public void setPartisipantsEvents(List<Event> partisipantsEvents) {
		this.partisipantsEvents = partisipantsEvents;
	}

	public void setInterests(Set<Interest> interests) {
		this.interests = interests;
	}

	public Set<Interest> getInterests() {
		return interests;
	}

}
