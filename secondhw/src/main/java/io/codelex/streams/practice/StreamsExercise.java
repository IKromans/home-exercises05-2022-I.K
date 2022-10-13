package io.codelex.streams.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * TODO - search for StreamsExerciseTest and make all tests pass
 */
public class StreamsExercise {
    public static List<Integer> returnSquareRoot(List<Integer> numbers) {
        return numbers.stream().map(i -> (int) Math.sqrt(i)).toList();
    }

    public static List<Integer> getAgeFromUsers(List<User> user) {
        return user.stream().map(User::getAge).collect(toList());
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        return users.stream().map(User::getAge).distinct().collect(toList());
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {
        return users.stream().limit(limit).collect(toList());
    }

    public static Integer countUsersOlderThen25(List<User> users) {
        return Math.toIntExact(users.stream().filter(i -> i.getAge() > 25).count());
    }

    public static List<String> mapToUpperCase(List<String> strings) {
        return strings.stream().map(String::toUpperCase).toList();
    }

    public static Integer sum(List<Integer> integers) {
        return integers.stream().mapToInt(Integer::intValue).sum();
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
        return integers.stream().skip(toSkip).collect(toList());
    }

    public static List<String> getFirstNames(List<String> names) {
        return names.stream().map(n -> n.split(" ")[0]).toList();
    }

    public static List<String> getDistinctLetters(List<String> names) {
        return names.stream().map(i -> i.split("")).flatMap(Arrays::stream).distinct().collect(toList());
    }

    public static String separateNamesByComma(List<User> users) {
        return users.stream().map(User::getName).collect(Collectors.joining(", "));
    }

    public static double getAverageAge(List<User> users) {
        return users.stream().mapToDouble(User::getAge).average().orElse(Double.NaN);
    }

    public static Integer getMaxAge(List<User> users) {
        return users.stream().map(User::getAge).max(Integer::compare).get();
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream().map(User::getAge).min(Integer::compare).get();
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::isMale, toList()));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::getAge, toList()));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::isMale, Collectors.groupingBy(User::getAge, toList())));
    }

    public static Map<Boolean, Long> countGender(List<User> users) {
        return users.stream().collect(Collectors.partitioningBy(User::isMale, Collectors.counting()));
    }

    public static boolean anyMatch(List<User> users, int age) {
        return users.stream().anyMatch(x -> x.getAge() == age);
    }

    public static boolean noneMatch(List<User> users, int age) {
        return users.stream().anyMatch(x -> x.getAge() != age);
    }

    public static Optional<User> findAny(List<User> users, String name) {
        return users.stream().filter(i -> name.equals(i.getName())).findAny();
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream().sorted(Comparator.comparing(User::getAge)).collect(toList());
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        return stream.boxed();
    }

    public static List<Integer> generateFirst10PrimeNumbers() {
        return new Random().ints(1000000, 2, 30).filter(StreamsExercise::isPrime).sorted().boxed().collect(toList());
    }

    public static boolean isPrime(int number) {
        return number > 1 && IntStream.range(2, number).noneMatch(i -> true);
    }

    public static List<Integer> generate10RandomNumbers() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) list.add(i % 2);
        Collections.shuffle(list);
        return list;
    }

    public static User findOldest(List<User> users) {
        return users.stream().reduce((a, b) -> a.getAge() < b.getAge() ? b : a).get();
    }

    public static int sumAge(List<User> users) {
        int sum = 0;
        for (int i = 0; i < users.size(); i++) {
            sum += users.get(i).getAge();
        }
        return sum;
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
        return users.stream().mapToInt(User::getAge).summaryStatistics();
    }
}
