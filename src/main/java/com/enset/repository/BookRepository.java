package com.enset.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.enset.models.Book;

@RepositoryRestResource
@CrossOrigin("*")
public interface BookRepository extends JpaRepository<Book, Long>{
}
