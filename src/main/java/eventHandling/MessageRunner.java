package eventHandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunner {
    public MessageRunner() {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("message-event-handling-config.xml");
        context.start();

        Message message = (Message) context.getBean("message");
        System.out.println(message);
        context.stop();
    }
}
