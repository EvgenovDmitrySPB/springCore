import annotations.DeveloperRunner;
import collectionInjection.CollectionInjectionRunner;
import examDependencies.ExamRunner;
import net.SpringHelloWorldRunner;

public class Runner {
    public static void main(String[] args) {
        //1) example exam. Автосвязывание по имени (byName)
        //ExamRunner examRunner = new ExamRunner();
        //2) Example
        //SpringHelloWorldRunner springHelloWorldRunner = new SpringHelloWorldRunner();
        //3) Example for collections
        //CollectionInjectionRunner collectionInjectionRunner = new CollectionInjectionRunner();
        //4) Annotations
        DeveloperRunner developerRunner = new DeveloperRunner();

    }
}
