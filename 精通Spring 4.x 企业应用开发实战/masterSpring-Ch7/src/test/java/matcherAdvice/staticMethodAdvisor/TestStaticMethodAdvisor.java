package matcherAdvice.staticMethodAdvisor;

import com.smart.matcherAdvice.Seller;
import com.smart.matcherAdvice.Waiter;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStaticMethodAdvisor {


    @Test
    public void testAdvice(){

        String configPath = "matcherAdvice\\staticMethodAdvisor\\advice-config.xml";

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter) classPathXmlApplicationContext.getBean("waiter");
        Seller seller = (Seller) classPathXmlApplicationContext.getBean("seller");

        waiter.greetTo("a");
        waiter.serveTo("a");
        seller.greetTo("b");


    }






}
