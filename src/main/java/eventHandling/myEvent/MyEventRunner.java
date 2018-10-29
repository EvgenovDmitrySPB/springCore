package eventHandling.myEvent;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyEventRunner {
    public MyEventRunner() {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("my-event-config.xml");

        MyEventPublisher myEventPublisher = (MyEventPublisher) context.getBean("myEventPublisher");
        myEventPublisher.publishEvent();
    }
}
