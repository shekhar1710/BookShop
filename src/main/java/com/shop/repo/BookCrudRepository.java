package com.shop.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shop.entity.Book;
@Repository
public interface BookCrudRepository extends CrudRepository<Book, Integer> {

}
