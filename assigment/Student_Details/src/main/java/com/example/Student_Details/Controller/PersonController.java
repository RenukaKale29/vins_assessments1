package com.example.Student_Details.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student_Details.Entites.Person;
import com.example.Student_Details.Service.PersonService;

@RestController
public class PersonController {
    
    @Autowired
    private PersonService personService;
    
    @PostMapping("/persons")
    public String savePerson(@RequestBody Person person) {
        return "/index";
    }
}
