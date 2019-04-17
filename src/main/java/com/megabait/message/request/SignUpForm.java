package com.megabait.message.request;

import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SignUpForm {
	@NotBlank
	@Size(min = 3, max = 50)
	private String firstName;

	@NotBlank
	@Size(min = 3, max = 50)
	private String secondName;

	@NotBlank
	@Size(min = 3, max = 50)
	private String username;

	@NotBlank
	@Size(max = 60)
	@Email
	private String email;

	@NotBlank
	@Size(min = 6, max = 40)
	private String password;

	@NotBlank
	@Size(min = 6, max = 50)
	private String phone;

	// // @NotBlank
	// @Size(min = 3, max = 50)
	// private String address;
	//
	// // @NotBlank
	// @Size(min = 1, max = 50)
	// private String city;
	//
	// // @NotBlank
	// @Size(min = 1, max = 60)
	// private String district;

	private Set<String> role;

	public String getPhone() {
		return phone;
	}

	// public String getAddress() {
	// return address;
	// }
	//
	// public String getCity() {
	// return city;
	// }
	//
	// public String getDistrict() {
	// return district;
	// }

	public void setPhone(String phone) {
		this.phone = phone;
	}

	// public void setAddress(String address) {
	// this.address = address;
	// }
	//
	// public void setCity(String city) {
	// this.city = city;
	// }
	//
	// public void setDistrict(String district) {
	// this.district = district;
	// }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<String> getRole() {
		return this.role;
	}

	public void setRole(Set<String> role) {
		this.role = role;
	}
}