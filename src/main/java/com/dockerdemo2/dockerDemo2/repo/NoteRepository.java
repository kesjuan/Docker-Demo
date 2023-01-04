package com.dockerdemo2.dockerDemo2.repo;

import com.dockerdemo2.dockerDemo2.model.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends CrudRepository<Note, Long> {
}