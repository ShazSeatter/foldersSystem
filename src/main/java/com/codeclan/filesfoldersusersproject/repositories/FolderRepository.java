package com.codeclan.filesfoldersusersproject.repositories;

import com.codeclan.filesfoldersusersproject.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
