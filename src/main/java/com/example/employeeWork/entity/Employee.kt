package com.example.employeeWork.entity

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees")
class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val Id: Long? = null

    @Column(nullable = false) // using the nullable =  false means not null
    private val firstname: String? = null

    @Column(nullable = false)
    private val lastname: String? = null

    @Column(nullable = false)
    private val department: String? = null

    @Column(nullable = false)
    private val salary: Int? = null

    @Column(nullable = false, unique = true)
    private val email: String? = null
    //    @ManyToOne
    //    @JoinColumn(name = "managerId")
    //    private Manager manager;
}
