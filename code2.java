import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int num = arr[i];

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }

            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            }
            else if (num > smallest && num < secondSmallest) {
                secondSmallest = num;
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);

        if (secondLargest == Integer.MIN_VALUE ||
            secondSmallest == Integer.MAX_VALUE) {

            System.out.println("Not enough unique elements.");

        } else {

            System.out.println("Second largest: " + secondLargest);
            System.out.println("Second smallest: " + secondSmallest);
        }

        sc.close();
    }
}