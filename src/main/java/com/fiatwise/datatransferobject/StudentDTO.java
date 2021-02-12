package com.fiatwise.datatransferobject;

import java.time.LocalDate;

import com.fiatwise.domainvalue.StudentStatus;

public class StudentDTO {
	private Integer id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String email;
	private Integer phoneNumber;
	private StudentStatus status;
	private String universityName;
	private LocalDate universityDate;

	public StudentDTO() {
		// TODO Auto-generated constructor stub
	}

	public StudentDTO(StudentDTOBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.dateOfBirth = builder.dateOfBirth;
		this.email = builder.email;
		this.phoneNumber = builder.phoneNumber;
		this.status = builder.status;
		this.universityName = builder.universityName;
		this.universityDate = builder.universityDate;
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

	public static StudentDTOBuilder newBuilder() {
		return new StudentDTOBuilder();
	}

	public static class StudentDTOBuilder {
		private String firstName;
		private String lastName;
		private LocalDate dateOfBirth;
		private String email;
		private Integer phoneNumber;
		private StudentStatus status;
		private String universityName;
		private LocalDate universityDate;

		public StudentDTOBuilder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public StudentDTOBuilder setLasttName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public StudentDTOBuilder setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
			return this;
		}

		public StudentDTOBuilder setEmail(String email) {
			this.email = email;
			return this;
		}

		public StudentDTOBuilder setPhoneNumber(Integer phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public StudentDTOBuilder setStatus(StudentStatus status) {
			this.status = status;
			return this;
		}

		public StudentDTOBuilder setUniversityName(String universityName) {
			this.universityName = universityName;
			return this;
		}

		public StudentDTOBuilder setUniversityDate(LocalDate universityDate) {
			this.universityDate = universityDate;
			return this;
		}

		public StudentDTO createStudentDTO() {
			return new StudentDTO(this);
		}
	}

}
