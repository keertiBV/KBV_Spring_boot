package com.keerti.javabrains.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.keerti.javabrains.service.Topic;
import com.keerti.javabrains.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	
	@RequestMapping("/topic")
	public List<Topic> getAllTopics(){
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topic/{id}")
	public Topic getOneTopic(@PathVariable String id) {
		return topicService.getOneTopic(id);
	}
	
	@RequestMapping (method=RequestMethod.POST,value="/topic")
	public void saveTopic(@RequestBody Topic topic) {
		topicService.saveTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topic/{id}")
	public void updateTopic (@PathVariable String id, @RequestBody Topic topic) {
		topicService.updateTopic(id, topic);
	}
	
	@RequestMapping (method=RequestMethod.DELETE,value="/topic/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}

}
