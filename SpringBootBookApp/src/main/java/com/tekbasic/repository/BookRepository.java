package com.tekbasic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tekbasic.Bo.Book;
@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

}
