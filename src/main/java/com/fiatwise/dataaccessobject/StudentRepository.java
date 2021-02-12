package com.fiatwise.dataaccessobject;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiatwise.domainobject.StudentDAO;
import com.fiatwise.domainvalue.StudentStatus;

@Repository
public interface StudentRepository extends JpaRepository<StudentDAO, Integer>{

	List<StudentDAO> findAllByuniversityName(String universityName);

	List<StudentDAO> findAllByStatus(StudentStatus status);

}
