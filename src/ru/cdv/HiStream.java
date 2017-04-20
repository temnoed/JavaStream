package ru.cdv;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class HiStream {

    public static void main(String[] args) {


        // Демонстрация метода .collect:

        List<Person> persons = Arrays.asList(
                new Person("Vova", 20),
                new Person("Gaga", 21),
                new Person("Muma", 21),
                new Person("Pupa", 30)
        );

        List<Person> filtered = persons.stream()
                .filter (p-> p.name.startsWith("G"))
                .collect(Collectors.toList());

        System.out.println(filtered);

        //------------------------------------

        Map<Integer, List<Person>> personByAge = persons.stream()

                .collect(Collectors.groupingBy(p -> p.age));

        personByAge.forEach((age, p) -> System.out.format("age %s : %s\n", age, p));



    }

}
