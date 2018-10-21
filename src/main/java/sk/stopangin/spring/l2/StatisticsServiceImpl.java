package sk.stopangin.spring.l2;

public class StatisticsServiceImpl implements StatisticsService {
    private DataService dataService;

    @Override
    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }


}
