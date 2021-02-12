package com.fiatwise.domainvalue;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "universities")
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "university_name")
	private String universityName;

	@Column(name = "university_code")
	private String universityCode;

	@Column(name = "established_Date")
	private LocalDate establishedDate;

	@Column(name = "country")
	private String country;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
