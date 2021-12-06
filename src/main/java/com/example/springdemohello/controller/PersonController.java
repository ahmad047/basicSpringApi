package com.example.springdemohello.controller;

import com.example.springdemohello.model.Person;
import com.example.springdemohello.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {
    PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public List<Person> getAllpersons(){
        return personService.findAllPersons();
    }

    @GetMapping("/persons/{id}")
    public Optional<Person> getPersonById(@PathVariable Long id){
        return personService.findPersonById(id);
    }

    @PostMapping("/persons")
    public void createPerson(@RequestBody Person person){
        personService.savePerson(person);
    }
}
