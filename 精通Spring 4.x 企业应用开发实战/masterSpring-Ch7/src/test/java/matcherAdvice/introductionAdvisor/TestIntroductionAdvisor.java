package matcherAdvice.introductionAdvisor;

import com.smart.advice.introductionAdvice.ForumService;
import com.smart.advice.introductionAdvice.Monitorable;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIntroductionAdvisor {

    @Test
    public void testAdvice() throws InterruptedException {
        String configPath = "matcherAdvice\\introductionAdvisor\\advice-config.xml";
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(configPath);
        ForumService forumService = (ForumService) classPathXmlApplicationContext.getBean("forumService");

        //未开启性能监控
        forumService.createTopic(45);
        forumService.removeTopic(4545);
        System.out.println("------------------");
        //开启性能监控
        Monitorable monitorable = (Monitorable) forumService;
        monitorable.setMonitorActive(true);

        forumService.createTopic(5454);
        forumService.removeTopic(87878);
    }
}
