Here is a Java console application that finds the median of two sorted arrays:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the first array:");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of the second array:");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        int[] mergedArray = mergeArrays(array1, array2);
        double median = findMedian(mergedArray);
        System.out.println("The median is: " + median);
    }

    private static int[] mergeArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        Arrays.sort(mergedArray);
        return mergedArray;
    }

    private static double findMedian(int[] array) {
        int length = array.length;
        if (length % 2 == 0) {
            return (array[length / 2 - 1] + array[length / 2]) / 2.0;
        } else {
            return array[length / 2];
        }
    }
}
```

This program first asks the user to input the sizes and elements of two arrays. It then merges these arrays into a single sorted array. Finally, it calculates and prints the median of the merged array.