package net;

public class SpringHelloWorld {
    private String helloMessage;
    private String today;

    public void getToday() {
        System.out.println("SpringHelloWorld : " + helloMessage + today);
    }

    public void setToday(String today) {
        this.today = today;
    }

    public void setHelloMessage(String helloMessage){
        this.helloMessage = helloMessage;
    }
    public void getHelloMessage(){
        System.out.println("SpringHelloWorld : " + helloMessage + today);
    }

    public void beanInit(){
        System.out.println("    SpringHelloWorld.beanInit");
    }
    public void beanDestroy(){
        System.out.println("    SpringHelloWorld.beanDestroy");
    }
}
