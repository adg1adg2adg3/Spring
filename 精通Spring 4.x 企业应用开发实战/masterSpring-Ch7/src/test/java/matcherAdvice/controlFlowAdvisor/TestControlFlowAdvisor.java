package matcherAdvice.controlFlowAdvisor;

import com.smart.matcherAdvice.Waiter;
import com.smart.matcherAdvice.controlFlowAdvisor.WaiterDelegate;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestControlFlowAdvisor {

    @Test
    public void testAdvice(){

        String configPath = "matcherAdvice\\controlFlowAdvisor\\advice-config.xml";

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter) classPathXmlApplicationContext.getBean("waiter");
        WaiterDelegate waiterDelegate = new WaiterDelegate();

        waiterDelegate.setWaiter(waiter);

        waiter.greetTo("a");
        waiter.serveTo("a");
        System.out.println("------------------------");
        waiterDelegate.service("a");
        waiterDelegate.service("b");


    }
}
