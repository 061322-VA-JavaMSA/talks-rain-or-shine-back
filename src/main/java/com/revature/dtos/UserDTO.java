package com.revature.dtos;

import java.util.Objects;

import com.revature.models.User;

public class UserDTO {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private int location;
	private int role;
	
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserDTO(User u) {
		id = u.getId();
		firstName = u.getFirstName();
		lastName = u.getLastName();
		email = u.getEmail();
		username = u.getUsername();
		location = u.getLocation();
		role = u.getRole();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, firstName, id, lastName, location, role, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDTO other = (UserDTO) obj;
		return Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName) && id == other.id
				&& Objects.equals(lastName, other.lastName) && location == other.location && role == other.role
				&& Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", username=" + username + ", location=" + location + ", role=" + role + "]";
	}
	
}