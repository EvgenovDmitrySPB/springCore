package aop.aopAnnotations;

import org.aspectj.lang.annotation.*;

@Aspect
public class Logging {
    @Pointcut("execution(* aop.aopAnnotations.*.*(..))")
    public void selectAllMethodsAvailable(){

    }

    @Before("selectAllMethodsAvailable()")
    public void beforeAdvice(){
        System.out.println("Now we are going to initiate developer's profile.");
    }

    @After("selectAllMethodsAvailable()")
    public void afterAdvice(){
        System.out.println("Developer's profile has been initiated.");
    }

    @AfterReturning(pointcut = "selectAllMethodsAvailable()", returning = "someValue")
    public void afterReturningAdvice(Object someValue){
        System.out.println("Value: " + someValue.toString());
    }

    @AfterThrowing(pointcut = "selectAllMethodsAvailable()", throwing = "e")
    public void inCaseOfExceptionThrowAdvice(ClassCastException e){
        System.out.println("We have an exception here: " + e.toString());
    }

}
