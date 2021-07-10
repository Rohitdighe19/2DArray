import java.util.Scanner;

public class Array2D {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of rows : ");
        int rows = input.nextInt();

        System.out.println("Enter number of columns : ");
        int column = input.nextInt();

        int array[][] = new int[rows][column];

        for (int j = 0; j <= rows - 1; j++) {

            for (int k = 0; k <= column - 1; k++) {
                System.out.println("Enter element : ");
                int arrayElement = input.nextInt();
                array[j][k] = arrayElement;
            }
        }

        for (int j = 0; j <= rows - 1; j++) {

            for (int k = 0; k <= column - 1; k++) {
                System.out.println("Element of 2D-Array at [" + j + "][" + k + "] = " + array[j][k]);
            }
        }
    }
}