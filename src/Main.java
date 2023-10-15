import exercises.*;

public class Main {
    public static void main(String[] args) {

        // Exercise 1
        System.out.println("\n----------------------------------\n");

        ArrayElements arrayElements = new ArrayElements();
        arrayElements.displayArray();

        // Exercise 2
        System.out.println("\n----------------------------------\n");

        Calculations calculations = new Calculations();
        calculations.sumOfElements();
        calculations.averageOfElements();
        calculations.countOfEvenAndOddElements();

        // Exercise 3
        System.out.println("\n----------------------------------\n");

        CopyArray copyArray = new CopyArray();
        copyArray.copyElements(copyArray.firstArray, copyArray.secondArray);

        System.out.println("\n----------------------------------\n");
    }
}