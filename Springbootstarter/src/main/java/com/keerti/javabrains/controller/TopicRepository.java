package com.keerti.javabrains.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.keerti.javabrains.service.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic,String> {

}
