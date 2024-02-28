package com.example.Student_Details.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Student_Details.Entites.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}