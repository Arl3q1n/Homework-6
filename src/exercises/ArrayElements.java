package exercises;

public class ArrayElements {

    int[] array = {1, 2, 3, 4, 5};

    public void displayArray() {

        System.out.print("Array elements: ");

        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
