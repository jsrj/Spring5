package com.arjaycodes.spring5webApp.Repositories;

import com.arjaycodes.spring5webApp.Models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
