package com.bsu;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<TennisPlayer> playersList = Arrays.asList(new TennisPlayer("Djokovic", 1, "Serbia"),
                new TennisPlayer("Nadal", 2, "Spain"),
                new TennisPlayer("Federer", 4, "Switzerland"),
                new TennisPlayer("Tsitsipas", 8, "USA"),
                new TennisPlayer("Isner", 10, "USA"));
        // filter
        List<TennisPlayer> america = playersList.stream().filter(f -> f.getCountry().equals("USA")).collect(Collectors.toList());
        america.forEach(System.out :: println);
        System.out.println();

        //map
        List<Integer> rating = Arrays.asList(1, 2, 4, 8, 10);
        List<Integer> doublePriceList = rating.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(doublePriceList);

        //toMap
        Map<String, String> playerName = playersList.stream().collect(Collectors.toMap(TennisPlayer::getName, TennisPlayer::getCountry));
        System.out.println(playerName);
        System.out.println();

        //reduce
        List<Integer> numbers = Arrays.asList(1, 2, 5);
        Integer sum = numbers.stream()
                .reduce(5, (identity, val) -> identity * val, (left, right) -> left + right);
        System.out.println(sum);
        System.out.println();

        //findAny
        System.out.println(playersList.stream().filter(f -> f.getRating() > 3).findAny());
        System.out.println();

        //findFirst
        System.out.println(playersList.stream().filter(f -> f.getRating() < 10).findFirst());
        System.out.println();

        //allmatch
        System.out.println(playersList.stream().allMatch(f -> f.getRating() >= 1));
        System.out.println();

        //anymatch
        System.out.println(playersList.stream().anyMatch(f -> f.getCountry().equals("Spain")));
        System.out.println();

        //nonematch
        System.out.println(playersList.stream().noneMatch(f -> f.getCountry().equals("Germany")));
        System.out.println();

        //groupingBy
        System.out.println(playersList.stream().collect(Collectors.groupingBy(TennisPlayer::getCountry)));
    }
}
