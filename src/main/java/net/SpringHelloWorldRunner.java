package net;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringHelloWorldRunner {
    public SpringHelloWorldRunner() {
        //IOC-контейнеры
        //1 ClassPathXmlApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-hello-bean.xml");
        //SpringHelloWorld springHelloWorld = (SpringHelloWorld) context.getBean("springHelloWorld");
        //springHelloWorld.getHelloMessage();

        //2 FileSystemXmlApplicationContext (требует абсолютный путь, используется при ресурсоОграниченности)
//        ApplicationContext context = new FileSystemXmlApplicationContext("file:src\\main\\resources\\spring-hello-bean.xml");

        SpringHelloWorld springHelloWorld = (SpringHelloWorld) context.getBean("springHelloWorld");
        springHelloWorld.setHelloMessage("Hey vasia");
        springHelloWorld.getHelloMessage();

        SpringHelloWorld springHelloWorld2 = (SpringHelloWorld) context.getBean("springHelloWorld");
        // springHelloWorld.setHelloMessage("Hey vasia");
        springHelloWorld2.getHelloMessage();
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();

        Hello2 hello2 = (Hello2) context.getBean("hello2");
        System.out.println("---Second bean -----");
        System.out.println(hello2.getHelloMessage() + " " + hello2.getToday());
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
    }
}
