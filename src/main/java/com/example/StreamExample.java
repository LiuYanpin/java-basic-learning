package com.example;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class StreamExample {
    private StreamExample() {
    }

    static Map<String, Long> getCount(List<String> items) {
        return items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
