package advice.exceptionAdvice;

import com.smart.advice.Waiter;
import com.smart.advice.exceptionAdvice.ForumService;
import com.smart.advice.exceptionAdvice.ForumServiceImpl;
import com.smart.advice.exceptionAdvice.TransactionManager;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class TestExceptionAdvice {

    @Test
    public void TestRemoveAdvice() throws SQLException {
        ForumServiceImpl forumService = new ForumServiceImpl();
        TransactionManager transactionManager = new TransactionManager();

        ProxyFactory proxyFactory = new ProxyFactory();

        //默认使用CGLib代理
/*

        //使用JDK代理
        proxyFactory.setInterfaces(ForumService.getClass().getInterfaces());
        //使用CGLib代理
        proxyFactory.setOptimize(true);
*/

        proxyFactory.setTarget(forumService);

        //可以设置多个增强及其次序
        proxyFactory.addAdvice(transactionManager);

        ForumService proxy = (ForumService) proxyFactory.getProxy();

        //默认使用CGLib代理

        proxy.removeTopicId(1213);
    }

    @Test
    public void TestUpdateAdvice() throws SQLException {
        ForumServiceImpl forumService = new ForumServiceImpl();
        TransactionManager transactionManager = new TransactionManager();

        ProxyFactory proxyFactory = new ProxyFactory();

        //默认使用CGLib代理
/*

        //使用JDK代理
        proxyFactory.setInterfaces(ForumService.getClass().getInterfaces());
        //使用CGLib代理
        proxyFactory.setOptimize(true);
*/

        proxyFactory.setTarget(forumService);

        //可以设置多个增强及其次序
        proxyFactory.addAdvice(transactionManager);

        ForumService proxy = (ForumService) proxyFactory.getProxy();

        //默认使用CGLib代理

        proxy.updateTopicId(4545);
    }

    @Test
    public void RemoveAdvice() throws SQLException {
        String configPath = "advice\\exceptionAdvice\\advice-config.xml";
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(configPath);
        ForumService forumService = (ForumService) classPathXmlApplicationContext.getBean("forumService");
        forumService.removeTopicId(1123);
    }

    @Test
    public void UpdateAdvice() throws SQLException {
        String configPath = "advice\\exceptionAdvice\\advice-config.xml";
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(configPath);
        ForumService forumService = (ForumService) classPathXmlApplicationContext.getBean("forumService");
        forumService.updateTopicId(1231);
    }
}
