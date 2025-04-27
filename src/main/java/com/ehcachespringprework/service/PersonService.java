package com.ehcachespringprework.service;

import com.ehcachespringprework.dto.PersonsDTO;
import com.ehcachespringprework.model.Persons;
import com.ehcachespringprework.repository.PersonsRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private PersonsRepo personsRepo;

    @Autowired
    public PersonService(PersonsRepo personsRepo) {
        this.personsRepo = personsRepo;
    }

    @Cacheable(value = "personsListCache", key = "'allPersons'")
    public List<Persons> getAllPersons() {
        System.out.println("here because not cached");
        var test = personsRepo.findAll();
        return test;
    }

    @Cacheable(value = "userCache", key = "#id")
    public Persons getPersonById(long id) {
        System.out.println("here because not cached");
        return personsRepo.findAll().get(0);
    }

    public Persons getPersonByIdNotCached(long id) {
        return personsRepo.findById(id).orElseThrow();
    }
    public PersonsDTO findAllPersonsWithDepartmentInfo(long id) {
        return personsRepo.findPersonWithDepartmentInfo(id);
    }
}
