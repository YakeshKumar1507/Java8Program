package JavaPrograms;

import java.util.Scanner;

public class ArrayExample2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of Elements");
        int length = scanner.nextInt();
        int arr[] = new int[length];

        System.out.println("Enter the inputs");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("------------------------");

        for (Integer i : arr) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("------------------------");

        System.out.println("Sum of given " + sum);
    }
}
