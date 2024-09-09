package com.ttdk6.cht.exercise6;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
public class TestSorting {
    private static List<Developer> getDevelopers() {

        List<Developer> result = new ArrayList<Developer>();

        result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
        result.add(new Developer("alvin", new BigDecimal("80000"), 20));
        result.add(new Developer("jason", new BigDecimal("100000"), 10));
        result.add(new Developer("iris", new BigDecimal("170000"), 55));

        return result;

    }

    public static void main(String[] args) {
        List<Developer> listDev = getDevelopers();

        System.out.println("Before sort");
        for (Developer developer : listDev) {
            System.out.println(developer);
        }

        System.out.println("After sort");

        //lambda, sort by age
        listDev.sort((Developer o1, Developer o2) -> o1.getAge() - o2.getAge());

        //print list
        listDev.forEach((developer -> System.out.println(developer)));

        //lambda, sort by name
        //listDev.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        //lambda, sort by salary
        //listDev.sort(((o1, o2) -> o1.getSalary().compareTo(o2.getSalary())));

    }
}
