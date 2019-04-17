package com.megabait.services;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.megabait.entities.User;

public class UserPrinciple implements UserDetails {
	private static final long serialVersionUID = 1L;

	private Long id;

	private String firstName;
	private String secondName;
	private String username;
	private String email;

	// Not needed for now
	// private String phone;
	// private String address;
	// private String city;
	// private String district;

	@JsonIgnore
	private String password;

	private Collection<? extends GrantedAuthority> authorities;

	/** , String phone, String address, String city, String district */
	public UserPrinciple(Long id, String firstName, String secondName, String username, String email, String password,
			Collection<? extends GrantedAuthority> authorities) {
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.username = username;
		this.email = email;
		this.password = password;
		this.authorities = authorities;
		// this.phone = phone;
		// this.address = address;
		// this.city = city;
		// this.district = district;
	}

	/**
	 * user.getPhone(), user.getAddress(), user.getCity(), user.getDistrict(),
	 */
	public static UserPrinciple build(User user) {
		List<GrantedAuthority> authorities = user.getRoles().stream()
				.map(role -> new SimpleGrantedAuthority(role.getName().name())).collect(Collectors.toList());

		return new UserPrinciple(user.getId(), user.getFirstName(), user.getSecondName(), user.getUsername(),
				user.getEmail(), user.getPassword(), authorities);
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public String getPassword() {
		return password;
	}

	// public String getPhone() {
	// return phone;
	// }
	//
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

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		UserPrinciple user = (UserPrinciple) o;
		return Objects.equals(id, user.id);
	}
}