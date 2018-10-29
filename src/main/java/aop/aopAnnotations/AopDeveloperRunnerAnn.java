package aop.aopAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopDeveloperRunnerAnn {
    public AopDeveloperRunnerAnn() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aopAnnotations-developer-config.xml");
        Developer developer = (Developer) context.getBean("developer");

        System.out.println(developer);
        developer.throwSomeMysticException();
    }
}
