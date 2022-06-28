package com.learning.service;

import com.learning.model.Person;
import com.learning.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAll() {
        return (List<Person>) personRepository.findAll();
    }

    public Person addPerson(Person person) {
        return personRepository.save(person);
    }

}
