package com.fiatwise.datatransferobject;

import java.time.LocalDate;
import java.util.Set;

import com.fiatwise.domainobject.StudentDAO;

public class UniversityDTO {
	private String universityName;
	private String universityCode;
	private LocalDate establishedDate;
	private Set<StudentDAO> students;
	private String country;

	public UniversityDTO(UniversityDTOBuilder builder) {
		this.universityName = builder.universityName;
		this.universityCode = builder.universityCode;
		this.establishedDate = builder.establishedDate;
		this.students = builder.students;
		this.country = builder.country;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getUniversityCode() {
		return universityCode;
	}

	public void setUniversityCode(String universityCode) {
		this.universityCode = universityCode;
	}

	public LocalDate getEstablishedDate() {
		return establishedDate;
	}

	public void setEstablishedDate(LocalDate establishedDate) {
		this.establishedDate = establishedDate;
	}

	public Set<StudentDAO> getStudents() {
		return students;
	}

	public void setStudents(Set<StudentDAO> students) {
		this.students = students;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public static UniversityDTOBuilder newBuilder() {
		return new UniversityDTOBuilder();
	}

	public static class UniversityDTOBuilder {
		private String universityName;
		private String universityCode;
		private LocalDate establishedDate;
		private Set<StudentDAO> students;
		private String country;

		public UniversityDTOBuilder setUniversityName(String universityName) {
			this.universityName = universityName;
			return this;
		}

		public UniversityDTOBuilder setUniversityCode(String universityCode) {
			this.universityCode = universityCode;
			return this;
		}

		public UniversityDTOBuilder setEstablishedDate(LocalDate establishedDate) {
			this.establishedDate = establishedDate;
			return this;
		}

		public UniversityDTOBuilder setStudents(Set<StudentDAO> students) {
			this.students = students;
			return this;
		}

		public UniversityDTOBuilder setCountry(String country) {
			this.country = country;
			return this;
		}

		public UniversityDTO createUniversityDTO() {
			return new UniversityDTO(this);
		}
	}

}
