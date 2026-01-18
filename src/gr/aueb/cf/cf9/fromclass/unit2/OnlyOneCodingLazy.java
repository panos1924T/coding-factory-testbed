package gr.aueb.cf.cf9.fromclass.unit2;

public class OnlyOneCodingLazy {

    private OnlyOneCodingLazy() {}

    private static OnlyOneCodingLazy lazy;

    public static OnlyOneCodingLazy getInstance() {
        if (lazy == null) {
            lazy = new OnlyOneCodingLazy();
        }
        return lazy;
    }
}
