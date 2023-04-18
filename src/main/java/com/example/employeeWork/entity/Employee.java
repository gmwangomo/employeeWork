package com.example.employeeWork.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false)   // using the nullable =  false means not null
    private String firstname;
    private String lastname;
    private String department;
    private Integer salary;
    @Column(nullable = false, unique = true)
    private String email;

}
