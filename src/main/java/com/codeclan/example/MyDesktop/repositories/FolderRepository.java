package com.codeclan.example.MyDesktop.repositories;

import com.codeclan.example.MyDesktop.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
