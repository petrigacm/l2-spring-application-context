package sk.stopangin.spring.l2.simpleeventlistener;

public class Runner {

    public static void main(String[] args) {
        StatisticsServiceImpl statisticsService = new StatisticsServiceImpl();
        SomeGenericLogger logger = new SomeGenericLogger();
        statisticsService.addEventListener(logger);

        statisticsService.computeStatistic();

    }
}
