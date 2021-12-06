package com.example.springdemohello.service;

import com.example.springdemohello.model.Person;
import com.example.springdemohello.respository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> findAllPersons(){
        return personRepository.findAll();
    }

    public Optional<Person> findPersonById(Long id){
        return personRepository.findById(id);
    }

    public void savePerson(Person person) {
        personRepository.save(person);
    }
}
