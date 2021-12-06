package com.example.springdemohello.respository;

import com.example.springdemohello.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
