package gr.aueb.cf.cf9.fromclass.unit2;

public class OnlyOneCodingFactory {

    private OnlyOneCodingFactory(){}

    private final static OnlyOneCodingFactory eager = new OnlyOneCodingFactory();

    public static OnlyOneCodingFactory getInstance() {
        return eager;
    }
}
