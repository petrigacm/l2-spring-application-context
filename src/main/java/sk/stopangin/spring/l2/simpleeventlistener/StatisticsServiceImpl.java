package sk.stopangin.spring.l2.simpleeventlistener;

import java.util.HashSet;
import java.util.Set;

public class StatisticsServiceImpl {
    private Set<EventListener> listeners = new HashSet<>();

    public void addEventListener(EventListener eventListener) {
        listeners.add(eventListener);
    }

    public void computeStatistic() {
        String statisticsData = "computesStatData";
        for (EventListener listener : listeners) {
            Event event = new Event(statisticsData);
            listener.fireEvent(event);
        }

    }
}
