package com.fiatwise.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiatwise.datatransferobject.StudentDTO;
import com.fiatwise.domainvalue.StudentStatus;
import com.fiatwise.service.StudentService;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@PostMapping(name = "/save")
	public StudentDTO createStudent(@RequestBody StudentDTO studentDTO) {
		return studentService.saveStudent(studentDTO);
	}

	@PutMapping(name = "/update")
	public StudentDTO updateStudent(@RequestBody StudentDTO studentDTO) {
		return studentService.updateStudent(studentDTO);
	}

	@DeleteMapping(value = "/{studentId}")
	public ResponseEntity<String> deleteStudent(@PathVariable("studentId") Integer studentId) {
		studentService.deleteStudent(studentId);
		return ResponseEntity.status(HttpStatus.OK).body("Delete Successfull.");
	}

	@GetMapping
	public List<StudentDTO> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping(value = "/{universityName}")
	public List<StudentDTO> getStudentsByUniversityName(@PathVariable("universityName") String universityName) {
		return studentService.getStudentsByUniversityName(universityName);
	}
	
	@GetMapping(value = "/status/{status}")
	public List<StudentDTO> getStudentsBystatus(@PathVariable("status") StudentStatus status) {
		return studentService.getStudentsBystatus(status);
	}
}
