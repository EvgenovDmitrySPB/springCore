package examDependencies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamRunner {
    public ExamRunner() {
        ApplicationContext context = new ClassPathXmlApplicationContext("exam-config.xml");

        Exam exam = (Exam) context.getBean("exam");
        exam.examCheck();
    }

}
