package fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Write a program that prints one line for each number from 1 to 100
 * For multiples of three print Fizz instead of the number
 * For the multiples of five print Buzz instead of the number
 * For numbers which are multiples of both three and five print FizzBuzz instead of the number
 */

public class FizzBuzz {

  static String calc(int i) {
    if ((i % 3 == 0) &&
        (i % 5 == 0)) {
      return "FizzBuzz";
    }
    if (i % 3 == 0) {
      return "Fizz";
    }
    if (i % 5 == 0) {
      return "Buzz";
    }
    return String.valueOf(i);
  }

  @SuppressWarnings("SameParameterValue")
  static List<String> calcRange(int start, int end) {
    return IntStream.range(start, end + 1)
        .mapToObj(FizzBuzz::calc)
        .collect(Collectors.toList());
  }

  public static void print(int start, int end) {
    calcRange(start, end).forEach(System.out::println);
  }
}
