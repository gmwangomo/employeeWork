package com.example.employeeWork.service

import com.example.employeeWork.entity.User
import com.example.employeeWork.repository.UserRepository
import lombok.AllArgsConstructor
import org.springframework.stereotype.Service

@Service
@AllArgsConstructor
class UserServiceImpl : UserService {
    private val userRepository: UserRepository? = null
    override fun createUser(user: User): User {
        return userRepository!!.save(user)
    }

    override fun getUserById(userId: Long): User {
        return null
    }

    override fun getAllUser(): List<User> {
        return null
    }

    override fun deleteUser(userId: Long) {}
}
