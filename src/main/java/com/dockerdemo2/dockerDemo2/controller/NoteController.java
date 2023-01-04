package com.dockerdemo2.dockerDemo2.controller;

import com.dockerdemo2.dockerDemo2.model.Note;
import com.dockerdemo2.dockerDemo2.repo.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteController {
    @Autowired
    private NoteRepository noteRepository;

    @GetMapping("/notes")
    public ResponseEntity<?> getAllNotes(){
        return new ResponseEntity<>(noteRepository.findAll(), HttpStatus.OK);
    }
    @PostMapping("/notes")
    public ResponseEntity<?> postNotes(@RequestBody Note note){
        return new ResponseEntity<>(noteRepository.save(note), HttpStatus.CREATED);
    }
}
