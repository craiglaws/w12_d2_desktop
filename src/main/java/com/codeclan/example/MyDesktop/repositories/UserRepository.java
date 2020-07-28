package com.codeclan.example.MyDesktop.repositories;

import com.codeclan.example.MyDesktop.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
