package matcherAdvice.dynamicMethodAdvisor;

import com.smart.matcherAdvice.Seller;
import com.smart.matcherAdvice.Waiter;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDynamicMethodAdvisor {

    @Test
    public void testAdvice(){

        String configPath = "matcherAdvice\\dynamicMethodAdvisor\\advice-config.xml";

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter) classPathXmlApplicationContext.getBean("waiter");

        waiter.greetTo("a");
        waiter.serveTo("a");

        waiter.greetTo("b");
        waiter.serveTo("b");


    }
}
