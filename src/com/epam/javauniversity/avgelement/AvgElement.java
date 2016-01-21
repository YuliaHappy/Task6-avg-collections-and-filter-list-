package com.epam.javauniversity.avgelement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class AvgElement {
    private AvgElement() {

    }

    public static <T extends Comparable<? super T>> T avg(Collection<? extends T> data) {
        if (data == null || data.isEmpty()) {
            throw new IllegalArgumentException("");
        }

        List<T> items = new ArrayList<T>(data);
        Collections.sort(items);
        return items.get(items.size() / 2);
    }
}
