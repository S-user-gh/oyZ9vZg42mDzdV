package com.feedback.Feedback.model;

import java.util.Collection;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "user")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Long id;

	@Email(message = "*Please provide a valid Email")
	@NotEmpty(message = "*Please provide an email")
	@Column(name = "email")
	private String email;

	@Length(min = 3, message = "*Your password must have at least 3 characters")
	@NotEmpty(message = "*Please provide your password")
	@Column(name = "password")
	private String password;

	@Length(min = 5, message = "*Your username must have at least 5 characters")
	@NotEmpty(message = "*Please provide your name")
	@Column(name = "user_name")
	private String username;

	@NotEmpty(message = "*Please provide your name")
	@Column(name = "name")
	private String name;

	@NotEmpty(message = "*Please provide your last name")
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "active")
	private int active;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))

	private Collection<Roles> roles;

	public Collection<Roles> getRoles() {
		return roles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public void setRoles(Collection<Roles> roles) {
		this.roles = roles;
	}
}
