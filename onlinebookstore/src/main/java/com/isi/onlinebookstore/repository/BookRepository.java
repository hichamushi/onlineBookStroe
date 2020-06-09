package com.isi.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isi.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
