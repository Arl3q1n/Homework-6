package exercises;

public class Calculations {

    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


    public void sumOfElements() {

        int sum = 0;

        for (int element: array) {
            sum += element;
        }

        System.out.println("Sum of elements in array: " + sum);
    }

    public void averageOfElements() {

        int sum = 0;

        for (int element : array) {
            sum += element;
        }

        System.out.println("Average of elements in array: " + ((double)sum/array.length));
    }

    public void countOfEvenAndOddElements() {

        int even = 0;
        int odd = 0;

        for (int element : array) {
            if (element % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Count of even elements in array: " + even);
        System.out.println("Count of odd elements in array: " + odd);
    }

}
