package com.ehcachespringprework.repository;

import com.ehcachespringprework.model.Persons;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonsRepo extends JpaRepository<Persons, Long> {
}
