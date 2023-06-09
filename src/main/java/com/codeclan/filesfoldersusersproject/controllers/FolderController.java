package com.codeclan.filesfoldersusersproject.controllers;

import com.codeclan.filesfoldersusersproject.models.Folder;
import com.codeclan.filesfoldersusersproject.models.User;
import com.codeclan.filesfoldersusersproject.repositories.FolderRepository;
import com.codeclan.filesfoldersusersproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class FolderController {
    @Autowired
    FolderRepository folderRepository;

    @GetMapping(value = "/folders")
    public ResponseEntity<List<Folder>> getAllFolders() {
        return new ResponseEntity<>(folderRepository.findAll(), HttpStatus.OK);
    }
}
