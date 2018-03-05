package com.feedback.Feedback.model;

import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Roles {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "role_id")
	private Long id;

	@Column(name = "role")
	private String role;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "roles")
	private Collection<Users> users;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Collection<Users> getUsers() {
		return users;
	}

	public void setUsers(Collection<Users> users) {
		this.users = users;
	}

}
