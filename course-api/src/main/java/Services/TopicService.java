/**
 * 
 */
package Services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import Beans.Topics;

/**
 * @author Adwiti
 *
 */
@Service
public class TopicService implements ITopicService {
	private List<Topics> lstTopics = Arrays.asList(new Topics("1", "Spring framework Description", "Spring framework"),
			new Topics("2", "java framework Description", "Java Language"));

	@Override
	public List<Topics> getListOfTopics() {
		return lstTopics;
	}

	@Override
	public Topics getATopic(String id) {
		return lstTopics.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
	}

}
