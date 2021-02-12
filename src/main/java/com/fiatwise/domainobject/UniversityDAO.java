package com.fiatwise.domainobject;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "university")
public class UniversityDAO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "university_name")
	private String universityName;

	@Column(name = "established_Date")
	private LocalDate establishedDate;
	
	@OneToMany
	private Set<StudentDAO> students;

	public UniversityDAO() {
		// TODO Auto-generated constructor stub
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((establishedDate == null) ? 0 : establishedDate.hashCode());
		result = prime * result + ((universityName == null) ? 0 : universityName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UniversityDAO other = (UniversityDAO) obj;
		if (establishedDate == null) {
			if (other.establishedDate != null)
				return false;
		} else if (!establishedDate.equals(other.establishedDate))
			return false;
		if (universityName == null) {
			if (other.universityName != null)
				return false;
		} else if (!universityName.equals(other.universityName))
			return false;
		return true;
	}

}
