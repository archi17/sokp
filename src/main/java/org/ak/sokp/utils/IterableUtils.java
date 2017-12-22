package org.ak.sokp.utils;

import java.util.ArrayList;
import java.util.List;

public class IterableUtils {

    public static <T> List<T> toList(Iterable<T> iterable) {
        List<T> target = new ArrayList<>();
        iterable.forEach(target::add);
        return target;
    }

}
