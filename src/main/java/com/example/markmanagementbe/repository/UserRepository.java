package com.example.markmanagementbe.repository;

import com.example.markmanagementbe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User getUserByPasswordEqualsAndUserNameEquals(String password, String username);
}
