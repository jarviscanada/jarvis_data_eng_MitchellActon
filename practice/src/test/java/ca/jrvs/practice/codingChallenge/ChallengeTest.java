package ca.jrvs.practice.codingChallenge;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ca.jrvs.practice.codingChallenge.EvenOrOdd;



public class ChallengeTest {

  @Test
  void evenOddTest() {
    EvenOrOdd testInstance = new EvenOrOdd();
    int valOdd = 5;
    int valEven = 6;

    assertEquals("odd", testInstance.evenOrOdd(valOdd));
    assertEquals("even", testInstance.evenOrOdd(valEven));
  }

  @Test
  void twoSumTest() {
    TwoSum testInstance = new TwoSum();
    int[] arrA = {0,1,2,3,4,5,6,7};
    int[] solA = {3,5};
    int[] arrB = {0,0,0,0,5,6};
    int[] solB = {4,5};

    assertArrayEquals(solA, testInstance.twoSum(arrA, 8));
    assertArrayEquals(solB, testInstance.twoSum(arrB, 11));
  }

  @Test
  void stringToIntTest() {
    StringToInteger testInstance = new StringToInteger();
    String strA = "1234";
    String strB = "-10";

    assertEquals(1234, testInstance.stringToInt(strA));
    assertEquals(-10, testInstance.stringToInt(strB));
  }

  @Test
  void swapTwoNumbersTest() {
    SwapTwoNumbers testInstance = new SwapTwoNumbers();
    int[] arr = {10,20};
    int[] expected = {20,10};
    assertArrayEquals(expected, testInstance.swapNumbers(arr));
  }

  @Test
  void stackUsingQueueTest() {
    StackUsingQueue testStack = new StackUsingQueue();
    testStack.push(1);
    testStack.push(2);
    assertEquals(2, testStack.pop());
    assertEquals(1, testStack.top());
    assertEquals(false, testStack.empty());
    assertEquals(1, testStack.pop());
    assertEquals(true, testStack.empty());

  }
}
