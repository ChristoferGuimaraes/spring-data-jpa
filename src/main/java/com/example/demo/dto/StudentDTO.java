package com.example.demo.dto;

import com.example.demo.entity.StudentEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
    private LocalDate birthDate;
    private LocalDate createdAt;


    public StudentDTO(StudentEntity studentEntity) {
        id = studentEntity.getId();
        firstName = studentEntity.getFirstName();
        lastName = studentEntity.getLastName();
        age = studentEntity.getAge();
        email = studentEntity.getEmail();
        birthDate = studentEntity.getBirthDate();
        createdAt = studentEntity.getCreatedAt();
    }

    public Integer getAge() {
        return Period.between(this.birthDate, LocalDate.now()).getYears();
    }

}
