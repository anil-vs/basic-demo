package com.eo.demo.controller;

import com.eo.demo.entity.Person;
import com.eo.demo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping(path = "/count")
    public int countChildren() {
        return personService.countChildren();
    }

    @GetMapping(path = "/list")
    public List<Person> list() {
        return personService.list();
    }

}