package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class StreamExampleTest {

    @Test
    public void should_return_count_given_different_fruits() {
        List<String> fruits = Arrays.asList("Apple", "Apple", "Apple", "Cherry", "Cherry", "Grape", "Lemon", "Peach", "Orange");
        Map<String, Long> result = StreamExample.getCount(fruits);
        assertEquals(3L, result.get("Apple").longValue());
        assertEquals(2L, result.get("Cherry").longValue());
        assertEquals(1L, result.get("Grape").longValue());
        assertEquals(1L, result.get("Lemon").longValue());
        assertEquals(1L, result.get("Peach").longValue());
        assertEquals(1L, result.get("Orange").longValue());
        System.out.println(result); // {Apple=3, Cherry=2, Grape=1, Peach=1, Orange=1, Lemon=1}

    }
}