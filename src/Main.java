import exercises.*;

public class Main {
    public static void main(String[] args) {

        // Exercise 1
        System.out.println("\n----------------------------------\n");

        ArrayElements Ex_1 = new ArrayElements();
        Ex_1.displayArray();

        // Exercise 2
        System.out.println("\n----------------------------------\n");

        Calculations Ex_2 = new Calculations();
        Ex_2.sumOfElements();
        Ex_2.averageOfElements();
        Ex_2.countOfEvenAndOddElements();

        // Exercise 3
        System.out.println("\n----------------------------------\n");

        CopyArray Ex_3 = new CopyArray();
        Ex_3.copyElements(Ex_3.firstArray, Ex_3.secondArray);

        System.out.println("\n----------------------------------\n");
    }
}