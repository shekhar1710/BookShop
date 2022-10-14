package com.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.entity.Book;
@Repository
public interface BookJpaRepository extends JpaRepository<Book, Integer> {

}
