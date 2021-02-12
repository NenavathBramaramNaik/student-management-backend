package com.fiatwise.dataaccessobject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiatwise.domainvalue.University;

@Repository
public interface UniversitoryRepository extends JpaRepository<University, Long>{

	University findByUniversityName(String universityCode);

}
