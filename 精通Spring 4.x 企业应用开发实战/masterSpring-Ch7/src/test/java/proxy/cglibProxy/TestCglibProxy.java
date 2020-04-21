package proxy.cglibProxy;

import com.smart.proxy.cglibProxy.ForumServiceImpl;
import com.smart.proxy.cglibProxy.CglibProxy;
import org.junit.Test;

public class TestCglibProxy {

    @Test
    public void testCglibProxy() throws InterruptedException {
        CglibProxy proxy = new CglibProxy();
        ForumServiceImpl forumService = (ForumServiceImpl) proxy.getProxy(ForumServiceImpl.class);
        forumService.createTopic(454545);
        forumService.removeTopic(21212);
    }
}
