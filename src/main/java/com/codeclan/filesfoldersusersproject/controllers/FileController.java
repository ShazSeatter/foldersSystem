package com.codeclan.filesfoldersusersproject.controllers;

import com.codeclan.filesfoldersusersproject.models.File;
import com.codeclan.filesfoldersusersproject.models.User;
import com.codeclan.filesfoldersusersproject.repositories.FileRepository;
import com.codeclan.filesfoldersusersproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFiles() {
        return new ResponseEntity(fileRepository.findAll(), HttpStatus.OK);
    }
}
