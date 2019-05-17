package com.example;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamGroupingByExample {
    private StreamGroupingByExample() {
    }

    public static Map<String, Long> getCountOfString(List<String> strings) {
        return strings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static Map<String, Long> getCount(List<Fruit> fruits) {
        return fruits.stream().collect(Collectors.groupingBy(Fruit::getName, Collectors.counting()));
    }

    public static Map<String, Integer> getSumOfQuantity(List<Fruit> fruits) {
        return fruits.stream().collect(Collectors.groupingBy(Fruit::getName, Collectors.summingInt(Fruit::getQuantity)));
    }

    public static Map<Integer, Set<String>> getNameGroupByPrice(List<Fruit> fruits) {
        return fruits.stream().collect(Collectors.groupingBy(Fruit::getPrice, Collectors.mapping(Fruit::getName, Collectors.toSet())));
    }
}
