package sk.stopangin.spring.l2;

public class ConcatenatedDataProvider implements DataProvider {
    @Override
    public Data getData() {
        return new Data("tsd");
    }
}
