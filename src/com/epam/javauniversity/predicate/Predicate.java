package com.epam.javauniversity.predicate;

public interface Predicate<T> {
    boolean apply(T item);
}