package com.arjaycodes.spring5webApp.Repositories;

import com.arjaycodes.spring5webApp.Models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
