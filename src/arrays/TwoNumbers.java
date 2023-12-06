package arrays;

import java.util.Scanner;

public class TwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Read N and K from the user
        System.out.print("Enter the number of elements N: ");
        int N = scanner.nextInt();
        System.out.println("Enter the number to check for K: ");
        int K = scanner.nextInt();

        // Initialize an array of size N
        int[] arr = new int[N];

        // Read N elements from the user
       
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Check if K exists in the array
        boolean found = false;
        for (int i = 0; i < N; i++) {
            if (arr[i] == K) {
                found = true;
                break;
            }
        }

        // Print "yes" or "no" based on whether K was found
        if (found) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        scanner.close();
    }

	}


