package ru.cdv;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainStream {

    public static void main(String[] args) {

        List<String> mList = Arrays.asList(
                "aa1", "cc2", "cc1", "aa2", "bb1");

        mList.stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        IntStream.range(1, 10)
                .forEach(System.out::println);

        Stream.of(4, 1, 2, 3, 5, 6, 7, 8)
                .sorted()
                .forEach(s -> System.out.print(s + " "));

        System.out.println();

        // Преобразование потоков
        // - поток объектов в примитивный поток
        Stream.of("c1","c2","c3")
                // вырезаем цифры
                .map(s -> s.substring(1))
                // конвертируем их в инт
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(s -> System.out.print(s + " "));

        System.out.println();

        // обратныя задача
        Stream.of(1.0,2.0, 3.0)
                // дабл в инт
                .mapToInt(Double::intValue)
                // инт в строку
                .mapToObj( i -> "c" + i)
                .forEach(s -> System.out.print(s + " "));

        // выполняются по цепочке сверху вниз!
        Stream.of("dd2", "aa2", "bb1", "bb3", "cc4")
                .map (s -> {
                    System.out.println("map:" + s);
                    return s.toUpperCase();
                })
                .filter (s -> {
                    System.out.println("filter:" + s);
                    return s.startsWith("A");
                })
                .forEach(s -> System.out.println("foreach: " + s));






    }

}
