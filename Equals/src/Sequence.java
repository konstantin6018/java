import java.util.*;

public class Sequence {

  public static int maxMonotonicSequenceLength(int[] elements) {
    int maxValue = 0;
    int positionOfMax = 0;
    int length = 2;

    for (int i = 2; i < elements.length; ++i) {
      if (elements[i] < maxValue) {
        int count = 1;
        int previousMaxElement = 0;

        for (int j = 1; j <= i-1; ++j) {
          if ((elements[j] < elements[i]) &&
              previousMaxElement < elements[j]) {

            previousMaxElement = elements[j];
            count = count + 1;
            if (length < count) {
              length = count;
              positionOfMax = j;
              maxValue = elements[j];
            }
          }
        }
      } else {
        positionOfMax = i;
        maxValue = elements[i];
        length = length + 1;
      }
    }
    return length + 1;
  }

  public static void main(String args[]) {
    int[] list = new int[10];

    list[0] = 1;
    list[1] = 2;
    list[2] = 9;
    list[3] = 4;
    list[4] = 7;
    list[5] = 3;
    list[6] = 11;
    list[7] = 8;
    list[8] = 14;
    list[9] = 6;

    System.out.println("lenght of subsequence: " + maxMonotonicSequenceLength(list));
  }
}
