package com.tmane.springdatarestappdemo.repository;

import com.tmane.springdatarestappdemo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, Long> {
}
