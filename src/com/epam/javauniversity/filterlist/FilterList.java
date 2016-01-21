package com.epam.javauniversity.filterlist;

import com.epam.javauniversity.predicate.Predicate;

import java.util.ArrayList;
import java.util.List;

public final class FilterList {
    private FilterList() {
    }

    public static <T> List<T> filter(List<T> data, Predicate<? super T> predicate) {
        if (data == null || predicate == null) {
            throw new IllegalArgumentException("");
        }
        List<T> result = new ArrayList<T>();
        for (T item : data) {
            if (predicate.apply(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
