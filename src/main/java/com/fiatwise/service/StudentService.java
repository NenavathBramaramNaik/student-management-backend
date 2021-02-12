package com.fiatwise.service;

import java.util.List;

import com.fiatwise.datatransferobject.StudentDTO;
import com.fiatwise.domainvalue.StudentStatus;

public interface StudentService {
	public StudentDTO saveStudent(StudentDTO student);

	public StudentDTO updateStudent(StudentDTO studentDTO);

	public void deleteStudent(Integer studentId);

	public List<StudentDTO> getAllStudents();

	public List<StudentDTO> getStudentsByUniversityName(String universityName);

	public List<StudentDTO> getStudentsBystatus(StudentStatus status);
}
