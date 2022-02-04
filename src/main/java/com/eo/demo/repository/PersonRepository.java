package com.eo.demo.repository;

import com.eo.demo.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    int countByAgeLessThan(int age);

    List<Person> findAll();

}
