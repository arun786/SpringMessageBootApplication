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

}
