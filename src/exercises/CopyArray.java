package exercises;

import java.util.Arrays;

public class CopyArray {

    public int[] firstArray = {1, 2, 3, 4, 5};
    public int[] secondArray = {6, 7, 8, 9, 10};


    public void copyElements(int[] array_1, int[] array_2) {

        System.out.print("Before copying: ");

        for (int element: array_1) {
            System.out.print(element + " ");
        }

        System.out.println();
        array_1 = array_2;

        System.out.print("After copying: ");

        for (int element: array_1) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

}
