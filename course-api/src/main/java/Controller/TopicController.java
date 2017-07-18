/**
 * 
 */
package Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Beans.Topics;
import Services.ITopicService;

/**
 * @author Adwiti
 *
 */
@RestController
public class TopicController {

	@Autowired
	ITopicService topicService;

	@RequestMapping(value = "/topics")
	public List<Topics> getListOfTopics() {
		return topicService.getListOfTopics();
	}

	@RequestMapping(value = "/topics/{id}")
	public Topics getATopic(@PathVariable("id") String id) {
		return topicService.getATopic(id);
	}
}
