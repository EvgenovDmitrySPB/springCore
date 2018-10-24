package net;

public class Hello2 {
    private String helloMessage;
    private String today;

    public String getHelloMessage() {
        return"This is simple message " + helloMessage;
    }

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    public String getToday() {
        return "And this message special " + today;
    }

    public void setToday(String today) {
        this.today = today;
    }

    public void beanInit(){
        System.out.println("    Hello2.beanInit");
    }
    public void beanDestroy(){
        System.out.println("    Hello2.beanDestroy");
    }
}
