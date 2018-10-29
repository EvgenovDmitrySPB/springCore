package aop.aopXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopDeveloperRunner {
    public AopDeveloperRunner() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aopXML-developer-config.xml");
        Developer developer = (Developer) context.getBean("developer");

        System.out.println(developer);
        developer.throwSomeMysticException();
    }
}
