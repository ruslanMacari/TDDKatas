package fizzbuzz;

import static org.assertj.core.api.BDDAssertions.then;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

  List<String> FIZZBUZZES_1_TO_100 = Arrays
      .asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
          "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz", "Fizz", "22", "23", "Fizz", "Buzz",
          "26", "Fizz", "28", "29", "FizzBuzz", "31", "32", "Fizz", "34", "Buzz", "Fizz", "37",
          "38", "Fizz", "Buzz", "41", "Fizz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "49",
          "Buzz", "Fizz", "52", "53", "Fizz", "Buzz", "56", "Fizz", "58", "59", "FizzBuzz", "61",
          "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz", "71", "Fizz", "73", "74",
          "FizzBuzz", "76", "77", "Fizz", "79", "Buzz", "Fizz", "82", "83", "Fizz", "Buzz", "86",
          "Fizz", "88", "89", "FizzBuzz", "91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98",
          "Fizz", "Buzz");

  @Test
  @DisplayName("for 3 multiplies should return Fizz")
  public void calcFizzForThreeMultiplies() {
    then(FizzBuzz.calc(3)).isEqualTo("Fizz");
    then(FizzBuzz.calc(6)).isEqualTo("Fizz");
    then(FizzBuzz.calc(9)).isEqualTo("Fizz");
    then(FizzBuzz.calc(18)).isEqualTo("Fizz");
  }

  @Test
  @DisplayName("for 5 multiplies should return Buzz")
  public void calcBuzzForFiveMultiplies() {
    then(FizzBuzz.calc(5)).isEqualTo("Buzz");
    then(FizzBuzz.calc(10)).isEqualTo("Buzz");
    then(FizzBuzz.calc(20)).isEqualTo("Buzz");
    then(FizzBuzz.calc(35)).isEqualTo("Buzz");
  }

  @Test
  @DisplayName("for 3 and 5 multiplies should return FizzBuzz")
  public void calcFizzBuzzFor3And5Multiplies() {
    then(FizzBuzz.calc(15)).isEqualTo("FizzBuzz");
    then(FizzBuzz.calc(30)).isEqualTo("FizzBuzz");
    then(FizzBuzz.calc(3 * 5 * 3)).isEqualTo("FizzBuzz");
  }

  @Test
  @DisplayName("for 1 to 100 should return FIZZBUZZES_1_TO_100")
  public void calcRangeNumbersFrom1To10() {
    then(FizzBuzz.calcRange(1, 100)).isEqualTo(FIZZBUZZES_1_TO_100);
  }

  @Test
  @DisplayName("for 1 to 100 should print FIZZBUZZES_1_TO_100")
  void printShouldPrintNumbersFrom1To100() {
    // given:
    ByteArrayOutputStream bo = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bo));
    // when:
    FizzBuzz.print(1, 100);
    // then:
    then(bo.toString().stripTrailing()).isEqualTo(String.join("\r\n", FIZZBUZZES_1_TO_100));
  }

}
