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
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false)   // using the nullable =  false means not null
    private String firstname;
    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false)
    private String department;
    @Column(nullable = false)
    private Integer salary;
    @Column(nullable = false, unique = true)
    private String email;

}
