package com.learning.web;

import com.learning.model.Person;
import com.learning.repository.PersonRepository;
import com.learning.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(path={"/person"})
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(path={"/people"}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Person> getAll() {
        return personService.getAll();
    }

    @PostMapping(path={"/add"}, consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Person addPerson(@RequestBody Person person) {
        return personService.addPerson(person);
    }


}
