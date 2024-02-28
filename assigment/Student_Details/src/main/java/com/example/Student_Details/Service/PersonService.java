package com.example.Student_Details.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student_Details.Entites.Person;
import com.example.Student_Details.Repository.PersonRepository;

@Service
public class PersonService {
    
	@Autowired
    private PersonRepository personRepository;
    
    public Person savePerson(Person person) {
        // Generate password using JavaScript logic
        String password = generatePassword(person.getFirstName(), person.getMiddleName(), person.getLastName());
        person.setPassword(password);
        
        // Save person entity to database
        return personRepository.save(person);
    }
    
    // JavaScript logic to generate password
    private String generatePassword(String firstName, String middleName, String lastName) {
        // Get first two characters from each name
        String firstChars = firstName.substring(0, 2);
        String middleChars = middleName.substring(0, 2);
        String lastChars = lastName.substring(0, 2);

        // Generate random 3-digit number
        int randomNumber = (int) (100 + Math.random() * 900);

        // Concatenate first two characters from each name with random number
        String password = firstChars + middleChars + lastChars + randomNumber;

        return password;
    }
}