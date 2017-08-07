/**
 * 
 */
package Services;

import java.util.ArrayList;
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
	private List<Topics> lstTopics = new ArrayList<>(
			Arrays.asList(new Topics("1", "Spring framework Description", "Spring framework"),
					new Topics("2", "java framework Description", "Java Language")));

	@Override
	public List<Topics> getListOfTopics() {
		return lstTopics;
	}

	@Override
	public Topics getATopic(String id) {
		return lstTopics.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
	}

	@Override
	public boolean addTopics(Topics topic) {
		return lstTopics.add(topic);
	}

	@Override
	public void updateTopic(Topics topic, String id) {
		lstTopics.forEach((t) -> {
			if (t.getId().equals(id)) {
				t.setDescription(topic.getDescription());
				t.setName(topic.getName());
			}
		});
	}

	@Override
	public void deleteTopic(String id) {
		
		lstTopics.remove(id);
		
	}

}
