package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class StreamExampleTest {

    private List<Fruit> fruits;

    @Before
    public void setUp() {
        fruits = Arrays.asList(
                new Fruit("Apple", 1, 1),
                new Fruit("Apple", 2, 1),
                new Fruit("Apple", 3, 2),
                new Fruit("Cherry", 4, 2),
                new Fruit("Cherry", 5, 3),
                new Fruit("Grape", 1, 3),
                new Fruit("Lemon", 2, 4),
                new Fruit("Peach", 3, 4),
                new Fruit("Orange", 4, 5)
        );
    }

    @Test
    public void should_return_count_given_different_fruits() {
        Map<String, Long> result = StreamExample.getCount(fruits);
        assertEquals(3L, result.get("Apple").longValue());
        assertEquals(2L, result.get("Cherry").longValue());
        assertEquals(1L, result.get("Grape").longValue());
        assertEquals(1L, result.get("Lemon").longValue());
        assertEquals(1L, result.get("Peach").longValue());
        assertEquals(1L, result.get("Orange").longValue());
    }

    @Test
    public void should_return_quantity_given_different_fruits() {
        Map<String, Integer> result = StreamExample.getSumOfQuantity(fruits);
        assertEquals(6, result.get("Apple").intValue());
        assertEquals(9, result.get("Cherry").intValue());
        assertEquals(1, result.get("Grape").intValue());
        assertEquals(2, result.get("Lemon").intValue());
        assertEquals(3, result.get("Peach").intValue());
        assertEquals(4, result.get("Orange").intValue());
    }
}