package com.fiatwise.mapper;

import org.springframework.beans.BeanUtils;

import com.fiatwise.datatransferobject.StudentDTO;
import com.fiatwise.domainobject.StudentDAO;

public class StudentMapper {
	public static StudentDAO makeStudentDAO(StudentDTO dto) {
		StudentDAO dao = new StudentDAO();
		BeanUtils.copyProperties(dto, dao);
		return dao;
	}

	public static StudentDTO makeStudentDTO(StudentDAO dao) {
		StudentDTO dto = StudentDTO.newBuilder().createStudentDTO();
		BeanUtils.copyProperties(dao, dto);
		return dto;
	}
}
