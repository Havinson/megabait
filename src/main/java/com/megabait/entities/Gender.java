package com.megabait.entities;

public enum Gender {
	MALE("Male"), FEMALE("Female"), NOT_SPECIFIED("Not specified");
	private final String gender;

	private Gender(String gender) {
		this.gender = gender;
	}// c-tor

	@Override
	public String toString() {
		return this.gender;
	}
}
