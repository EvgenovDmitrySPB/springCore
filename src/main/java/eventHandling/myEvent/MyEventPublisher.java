package eventHandling.myEvent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class MyEventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisherAware;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisherAware) {
        this.publisherAware = publisherAware;
    }

    public void publishEvent(){
        MyEvent myEvent = new MyEvent(this);
        publisherAware.publishEvent(myEvent);
    }
}
