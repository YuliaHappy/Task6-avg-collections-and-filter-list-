package com.epam.javauniversity.avgelement;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AvgElementTest {

    @Test
    public void avgTestInteger() throws Exception {
        List<Integer> data = new ArrayList<Integer>();
        data.add(2);
        data.add(4);
        data.add(1);
        data.add(3);
        data.add(6);
        data.add(5);

        assertEquals(AvgElement.avg(data), new Integer(4));
    }

    @Test
    public void avgTestString() throws Exception {
        List<String> data = new ArrayList<String>();
        data.add("b");
        data.add("d");
        data.add("a");
        data.add("c");
        data.add("f");
        data.add("e");

        assertEquals(AvgElement.avg(data), new String("d"));
    }
}