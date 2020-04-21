package proxy.jdkProxy;

import com.smart.proxy.jdkProxy.ForumService;
import com.smart.proxy.jdkProxy.PerformanceHandler;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class TextJdkProxy {

    @Test
    public void testJdkProxy(){

        ForumService forumService = new com.smart.proxy.jdkProxy.ForumServiceImpl();

        //编织业务类与横切代码
        PerformanceHandler handler = new PerformanceHandler(forumService);

        //创建代理实例,依赖接口
        ForumService instance = (ForumService) Proxy.newProxyInstance(
                forumService.getClass().getClassLoader(),
                forumService.getClass().getInterfaces(),
                handler
        );

        instance.createTopic(13123);
        instance.removeTopic(20545);
    }
}
