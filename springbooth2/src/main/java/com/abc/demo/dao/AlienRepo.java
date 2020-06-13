package com.abc.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.abc.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien ,Integer> {

}
