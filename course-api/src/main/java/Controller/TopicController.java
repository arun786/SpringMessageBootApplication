/**
 * 
 */
package Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Beans.Topics;

/**
 * @author Adwiti
 *
 */
@RestController
public class TopicController {

	@RequestMapping(value = "/topics")
	public String getAllTopics() {
		return "All String";
	}

	@RequestMapping(value="/lstTopics")
	public List<Topics> getListOfTopics() {
		List<Topics> lstTopics = new ArrayList<>();
		Topics t1 = new Topics("1", "Spring framework Description", "Spring framework");
		Topics t2 = new Topics("2", "java framework Description", "Java Language");
		lstTopics.add(t1);
		lstTopics.add(t2);
		return lstTopics;
	}
}
