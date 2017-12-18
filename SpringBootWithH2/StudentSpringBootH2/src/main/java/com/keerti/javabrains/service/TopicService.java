package com.keerti.javabrains.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerti.javabrains.model.Topic;
import com.keerti.javabrains.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	List<Topic> topic= new ArrayList<>(Arrays.asList(new Topic("101","Java","Java App"),
			new Topic ("102","SQL","SQL server")));

	public List<Topic> getAllTopics() {
		List<Topic> topics=new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	
	public Topic getOneTopic(String id) {
		return topicRepository.findOne(id);
	}
	
	public void saveTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}
	
	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}
}
