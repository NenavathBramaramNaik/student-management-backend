package com.fiatwise.domainobject;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fiatwise.domainvalue.StudentStatus;

@Entity
@Table(name = "student")
public class StudentDAO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "dateOfBirth")
	private LocalDate dateOfBirth;

	@Column(name = "email")
	private String email;

	@Column(name = "phone_number")
	private Integer phoneNumber;

	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private StudentStatus status;

	@Column(name = "university_name")
	private String universityName;

	@Column(name = "university_date")
	private LocalDate universityDate;

	public StudentDAO() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public StudentStatus getStatus() {
		return status;
	}

	public void setStatus(StudentStatus status) {
		this.status = status;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public LocalDate getUniversityDate() {
		return universityDate;
	}

	public void setUniversityDate(LocalDate universityDate) {
		this.universityDate = universityDate;
	}

}
