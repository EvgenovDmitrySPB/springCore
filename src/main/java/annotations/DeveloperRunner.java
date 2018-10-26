package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeveloperRunner {
    public DeveloperRunner() {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotations-required.xml");
        Developer developer = (Developer) context.getBean("javaDeveloper");
        System.out.println(developer.toString());

        Position position = (Position) context.getBean("position");
        position.getDeveloper();
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
    }
}
