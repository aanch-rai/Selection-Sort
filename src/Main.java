import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] input_array = getIntegers();
        sortIntegers(input_array);

    }

    //function to scan the input array
    public static int[] getIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of elements of array");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] inp_array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < inp_array.length; i++) {
            System.out.print("Element " + i + ": ");
            inp_array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        return inp_array;
    }


    //function to print the array to the console
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " : " + array[i]);
        }
        return;
    }

    //Selection Sort implementation
    public static void sortIntegers(int[] array) {
        for (int i = 0; i <= array.length - 2; i++) {
            int max = array[i];         //selecting first element to be maximum
            int left_most_element = i;
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (array[i] < array[j]) {
                    max = array[j];
                    left_most_element = j;

                    //Swapping elements such that maximum element remains at the left_most_position.
                    array[left_most_element] = array[i];
                    array[i] = max;
                }
            }
        }
        System.out.println("Sorted Array Elements are:");
        printArray(array);
    }
}
