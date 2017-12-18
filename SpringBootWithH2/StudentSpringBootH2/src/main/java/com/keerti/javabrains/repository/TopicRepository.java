package com.keerti.javabrains.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.keerti.javabrains.model.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic,String> {

}
