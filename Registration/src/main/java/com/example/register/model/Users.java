package com.example.register.model;

import java.io.Serializable;

public class Users implements Serializable {

	private static final long serialVersionUID = 1L;

	String username;

	String email;

	String password;

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

}
