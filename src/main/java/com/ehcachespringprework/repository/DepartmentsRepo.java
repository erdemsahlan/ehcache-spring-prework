package com.ehcachespringprework.repository;

import com.ehcachespringprework.model.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentsRepo extends JpaRepository<Departments, Integer> {

}
