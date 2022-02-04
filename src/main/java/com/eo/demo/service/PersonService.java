package com.eo.demo.service;

import com.eo.demo.entity.Person;
import com.eo.demo.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public int countChildren() {
        return personRepository.countByAgeLessThan(18);
    }

    public List<Person> list() {
        return personRepository.findAll();
    }

}
