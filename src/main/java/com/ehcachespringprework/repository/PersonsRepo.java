package com.ehcachespringprework.repository;

import com.ehcachespringprework.dto.PersonsDTO;
import com.ehcachespringprework.model.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonsRepo extends JpaRepository<Persons, Long> {
    @Query("SELECT new com.ehcachespringprework.dto.PersonsDTO(p.id, p.firstName, p.lastName, p.email, p.phone, p.address, p.department.id, p.department.departmentName) FROM Persons p WHERE p.id = :id")
    PersonsDTO findPersonWithDepartmentInfo(@Param("id") long id);
}