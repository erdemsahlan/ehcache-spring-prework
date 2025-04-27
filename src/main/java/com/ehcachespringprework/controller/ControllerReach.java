package com.ehcachespringprework.controller;

import com.ehcachespringprework.service.CalculateService;
import com.ehcachespringprework.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ControllerReach {
    private PersonService personService;
    private CalculateService calculatorService;

    @Autowired
    public ControllerReach(CalculateService calculatorService, PersonService personService) {
        this.calculatorService = calculatorService;
        this.personService = personService;
    }





    @GetMapping("/areaOfSquare")
    public ResponseEntity<Double> areaofSquare(@RequestParam int side) {
        return ResponseEntity.ok(calculatorService.areaOfSquare(side));
    }

    @GetMapping(path = "/evict")
    public ResponseEntity<String> evictCache() {
        calculatorService.clearCache();
        return ResponseEntity.ok("Cache successfully clean");
    }
    @GetMapping(path = "/getAll")
    public ResponseEntity<?> getAllPersons() {
        var result = personService.getAllPersons();
        return ResponseEntity.ok(result);
    }
    @GetMapping(path = "/getById/{id}")
    public ResponseEntity<?> getPersonById(@PathVariable int id) {
        var result = personService.getPersonById(id);
        return ResponseEntity.ok(result);
    }
    @GetMapping(path = "/getPersonByIdNotCached/{id}")
    public ResponseEntity<?> getPersonByIdNotCached(@PathVariable int id) {
        var result = personService.getPersonByIdNotCached(id);
        return ResponseEntity.ok(result);
    }
    @GetMapping(path = "/findAllPersonsWithDepartmentInfo/{id}")
    public ResponseEntity<?> findAllPersonsWithDepartmentInfo(@PathVariable long id) {
        var result = personService.findAllPersonsWithDepartmentInfo(id);
        return ResponseEntity.ok(result);
    }
}
