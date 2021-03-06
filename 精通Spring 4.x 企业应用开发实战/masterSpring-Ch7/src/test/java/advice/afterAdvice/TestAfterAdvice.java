package advice.afterAdvice;

import com.smart.advice.NaiveWaiter;
import com.smart.advice.Waiter;
import com.smart.advice.AfterAdvice.GreetingAfterAdvice;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAfterAdvice {

    @Test
    public void TestAdvice(){
        NaiveWaiter naiveWaiter = new NaiveWaiter();
        GreetingAfterAdvice advice = new GreetingAfterAdvice();

        ProxyFactory proxyFactory = new ProxyFactory();

        //默认使用CGLib代理
/*

        //使用JDK代理
        proxyFactory.setInterfaces(naiveWaiter.getClass().getInterfaces());
        //使用CGLib代理
        proxyFactory.setOptimize(true);
*/

        proxyFactory.setTarget(naiveWaiter);

        //可以设置多个增强及其次序
        proxyFactory.addAdvice(advice);

        Waiter proxy = (Waiter) proxyFactory.getProxy();

        //默认使用CGLib代理

        proxy.greetTo("a");
        proxy.serveTo("a");
    }

    @Test
    public void XMLAdvice(){
        String configPath = "advice\\afterAdvice\\advice-config.xml";
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = (Waiter) classPathXmlApplicationContext.getBean("waiter");
        waiter.greetTo("a");
        waiter.serveTo("a");
    }
}
