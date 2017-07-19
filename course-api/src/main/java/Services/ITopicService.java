/**
 * 
 */
package Services;

import java.util.List;

import Beans.Topics;

/**
 * @author Adwiti
 *
 */
public interface ITopicService {

	public List<Topics> getListOfTopics();

	public Topics getATopic(String id);
	
	public boolean addTopics(Topics topic);
	
	public void updateTopic(Topics topic, String id);

}
