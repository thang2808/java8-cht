package com.ttdk6.cht.exercise7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NowJava8 {

    public static void main(String[] args) {

//        //VI DU 1
//        List<String> lines = Arrays.asList("spring", "node", "mkyong");
//
//        List<String> result = lines.stream()                // convert list to stream
//                .filter(line -> !"mkyong".equals(line))     // we dont like mkyong
//                .collect(Collectors.toList());              // collect the output and convert streams to a List
//
//        result.forEach(System.out::println);                //output : spring, node


        //VI DU 2
        List<Person> persons = Arrays.asList(
                new Person("aaa", 20),
                new Person("bbb", 19),
                new Person("ccc", 21)
        );

        Person result1 = persons.stream()
                .filter((p) -> "aaa".equals(p.getName())&& 20 ==p.getAge())
                .findAny()
                .orElse(null);

        System.out.println(result1);


        //or like this
        Person result2 = persons.stream()
                .filter((p) -> {
                    if ("aaa".equals(p.getName())&& 20 == p.getAge()) {
                        return true;
                    }
                    return false;
                }).findAny().orElse(null);
        System.out.println("result 2 :" + result2);

        //stream filter() and map()
        String name = persons.stream()
                .filter((p) -> "aaa".equals(p.getName()))
                .map(Person::getName)
                .findAny()
                .orElse(null);
        System.out.println("name: " + name);

        List<String> collect = persons.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}