package sk.stopangin.spring.l2.events;

public class Event <T> {
    private T data;

    public Event(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
