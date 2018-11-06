package sk.stopangin.spring.l2.simpleeventlistener;

public class Event {
    private Object data;

    public Event(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
