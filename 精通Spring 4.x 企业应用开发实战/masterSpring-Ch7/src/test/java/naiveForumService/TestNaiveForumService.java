package naiveForumService;

import com.smart.naiveForumService.NaiveForumService;
import org.junit.Test;

public class TestNaiveForumService {

    @Test
    public void testNaiveForumService(){
        NaiveForumService naiveForumService = new NaiveForumService();
        naiveForumService.createTopic();
        System.out.println("------------");
        naiveForumService.removeTopic();
    }
}
