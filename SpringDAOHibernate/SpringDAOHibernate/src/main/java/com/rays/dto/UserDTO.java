package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ST_USER")
public class UserDTO {

	@Id
	@GeneratedValue(generator = "nextPk")
	@GenericGenerator(name = "nextPk", strategy = "native")
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;

	@Column(name = "FIRST_NAME", length = 50)
	private String firstName;

	@Column(name = "LAST_NAME", length = 50)
	private String lastName;

	@Column(name = "LOGIN_ID", length = 50)
	private String loginId;

	@Column(name = "PASSWORD", length = 50)
	private String password;

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

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// email.login=project04java@gmail.com
	// email.pwd=dpscsxwkxmprykpz
}
