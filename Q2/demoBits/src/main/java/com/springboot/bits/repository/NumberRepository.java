package com.springboot.bits.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.bits.entity.Number;

public interface NumberRepository extends CrudRepository<Number, Long> {

}
