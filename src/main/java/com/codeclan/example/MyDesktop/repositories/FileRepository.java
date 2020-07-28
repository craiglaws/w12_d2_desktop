package com.codeclan.example.MyDesktop.repositories;

import com.codeclan.example.MyDesktop.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
