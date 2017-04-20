package ru.cdv;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierStream {

    public static void main(String[] args) {

        Supplier<Stream<String>> streamSupplier = () ->
                Stream.of("dd2", "aa2", "bb1", "bb3", "cc")
                        .filter(s -> s.startsWith("a"));
        streamSupplier.get().anyMatch(s -> true);
        streamSupplier.get().noneMatch(s -> true);

    }

}
