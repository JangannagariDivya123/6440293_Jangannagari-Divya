import java.util.Scanner;

public class NumberStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int count = sc.nextInt();

        int[] arr = new int[count];
        int sum = 0;

        System.out.println("Enter " + count + " integers:");
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double average = (double) sum / count;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        sc.close();
    }
}
