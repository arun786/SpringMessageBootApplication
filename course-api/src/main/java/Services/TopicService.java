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

	@Override
	public List<Topics> getListOfTopics() {
		return Arrays.asList(new Topics("1", "Spring framework Description", "Spring framework"),
				new Topics("2", "java framework Description", "Java Language"));
	}

}
