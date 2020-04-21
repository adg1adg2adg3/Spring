package proxy;

import com.smart.proxy.ForumServiceImpl;
import org.junit.Test;

public class TestForumService {

    @Test
    public void testForumService() throws InterruptedException {
        ForumServiceImpl forumService = new ForumServiceImpl();
        forumService.createTopic(20);
        System.out.println("------------");
        forumService.removeTopic(20);
    }


}
