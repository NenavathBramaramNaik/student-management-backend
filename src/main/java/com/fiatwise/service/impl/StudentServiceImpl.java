package com.fiatwise.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.fiatwise.dataaccessobject.StudentRepository;
import com.fiatwise.dataaccessobject.UniversitoryRepository;
import com.fiatwise.datatransferobject.StudentDTO;
import com.fiatwise.domainobject.StudentDAO;
import com.fiatwise.domainvalue.StudentStatus;
import com.fiatwise.domainvalue.University;
import com.fiatwise.exception.StudentNotFoundException;
import com.fiatwise.exception.UniversityNotFoundException;
import com.fiatwise.mapper.StudentMapper;
import com.fiatwise.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private final StudentRepository studentRepository;
	private final UniversitoryRepository universitiesRepository;

	public StudentServiceImpl(StudentRepository studentRepository, UniversitoryRepository universitiesRepository) {
		this.studentRepository = studentRepository;
		this.universitiesRepository = universitiesRepository;
	}

	@Override
	public StudentDTO saveStudent(StudentDTO student) {
		getUniversity(student.getUniversityName());
		return StudentMapper.makeStudentDTO(studentRepository.save(StudentMapper.makeStudentDAO(student)));
	}

	@Override
	public StudentDTO updateStudent(StudentDTO student) {
		checkstudent(student.getId());
		return StudentMapper.makeStudentDTO(studentRepository.save(StudentMapper.makeStudentDAO(student)));
	}

	@Override
	public void deleteStudent(Integer studentId) {
		checkstudent(studentId);
		studentRepository.deleteById(studentId);
	}

	@Override
	public List<StudentDTO> getAllStudents() {
		return studentRepository.findAll().stream().map(StudentMapper::makeStudentDTO).collect(Collectors.toList());
	}

	@Override
	public List<StudentDTO> getStudentsByUniversityName(String universityName) {
		getUniversity(universityName);
		return studentRepository.findAllByuniversityName(universityName).stream().map(StudentMapper::makeStudentDTO)
				.collect(Collectors.toList());
	}

	@Override
	public List<StudentDTO> getStudentsBystatus(StudentStatus status) {
		return studentRepository.findAllByStatus(status).stream().map(StudentMapper::makeStudentDTO)
				.collect(Collectors.toList());
	}

	/**
	 * isUniversityAvailable
	 * 
	 * @param StudentDTO
	 * @throws UniversityNotFoundException
	 */

	private University getUniversity(String universityName) {
		return Optional.ofNullable(universitiesRepository.findByUniversityName(universityName)).orElseThrow(
				() -> new UniversityNotFoundException("Could not find the selected university " + universityName));
	}

	/**
	 * 
	 * @param studentId
	 * @return
	 * @throws StudentNotFoundException
	 */
	private StudentDAO checkstudent(Integer studentId) {
		return studentRepository.findById(studentId).orElseThrow(() -> new StudentNotFoundException(
				"Could not find the Student for the given booking ID: " + studentId));
	}

}
