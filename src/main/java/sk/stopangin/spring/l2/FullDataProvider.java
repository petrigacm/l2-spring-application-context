package sk.stopangin.spring.l2;

public class FullDataProvider implements DataProvider {
    @Override
    public Data getData() {
        return new Data("toto su plne data");
    }
}
