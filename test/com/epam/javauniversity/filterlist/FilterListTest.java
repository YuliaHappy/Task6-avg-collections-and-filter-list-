package com.epam.javauniversity.filterlist;

import org.junit.Assert;
import org.junit.Test;
import com.epam.javauniversity.predicate.Predicate;

import java.util.ArrayList;
import java.util.List;

public class FilterListTest {

    @Test
    public void filterTestPredicateIsMoreHundred() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(1);
        list.add(5);
        list.add(101);

        List<Integer> resList = new ArrayList<Integer>();
        resList.add(100);
        resList.add(101);

        Assert.assertEquals(FilterList.filter(list, new Predicate<Integer>() {
            @Override
            public boolean apply(Integer item) {
                return item >= 100;
            }
        }), resList);
    }

    @Test
    public void filterTestPredicateIsMultipledFive() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(1);
        list.add(5);
        list.add(105);

        List<Integer> resList = new ArrayList<Integer>();
        resList.add(100);
        list.add(5);
        resList.add(105);

        Assert.assertEquals(FilterList.filter(list, new Predicate<Integer>() {
            @Override
            public boolean apply(Integer item) {
                return item % 5 == 0 && item > 5;
            }
        }), resList);
    }
}