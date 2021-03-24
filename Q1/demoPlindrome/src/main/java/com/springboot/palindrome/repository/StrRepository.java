package com.springboot.palindrome.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.palindrome.entity.Str;

public interface StrRepository extends CrudRepository<Str, Long> {

}
