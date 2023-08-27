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
@Table(name = "Manager")
class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val Id: Long? = null

    @Column(nullable = false)
    private val firstName: String? = null

    @Column(nullable = false)
    private val lastName: String? = null

    @Column(nullable = false)
    private val sex: String? = null

    @Column(nullable = false, unique = true)
    private val email: String? = null
    //    @OneToMany
    //    @JoinColumn( name = "EmployeeId")
    //    private val Employee;
}
