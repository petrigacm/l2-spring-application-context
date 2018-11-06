package sk.stopangin.spring.l2.simpleeventlistener;

public class SomeGenericLogger implements EventListener {

    @Override
    public void fireEvent(Event event) {
        System.out.println("From logging listener:" + event.getData());
    }
}
